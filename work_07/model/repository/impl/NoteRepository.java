package work_07.model.repository.impl;

import work_07.model.Note;
import work_07.model.repository.Operational;
import work_07.util.connector.Connector;
import work_07.util.mapper.Mappable;
import work_07.util.mapper.impl.NoteMapper;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NoteRepository implements Operational<Note> {
    private final Mappable<Note, String> mapper;
    private final Connector connector;

    public NoteRepository(Connector connector, String sep) {
        this.mapper = new NoteMapper(sep);
        this.connector = connector;
    }

    public NoteRepository(Connector connector) {
        this(connector, ", ");
    }


    @Override
    public Note create(Note note) {
        List<Note> notes = getAll();
        long lastId = 0L;

        for (Note n: notes) {
            long id = n.getId();

            if (lastId < id) lastId = id;
        }

        long nextId = lastId + 1;
        note.setId(nextId);
        notes.add(note);
        save(notes);

        return note;
    }

    @Override
    public List<Note> getAll() {
        List<String> lines = new ArrayList<>();
        List<Note> notes = new ArrayList<>();

        try {
            File file = new File(connector.db_path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            if (line != null) lines.add(line);

            while (line != null) {
                line = reader.readLine();

                if (line != null) lines.add(line);
            }

            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line: lines) notes.add(mapper.toInput(line));

        return notes;
    }

    @Override
    public Optional<Note> get(Long id) {
        List<Note> notes = getAll();

        for (Note note: notes)
            if (note.getId().equals(id))
                return Optional.of(note);

        return Optional.empty();
    }

    @Override
    public Optional<Note> update(Long id, Note nUpdate) {
        List<Note> notes = getAll();
        Note noteToUpdate = notes.stream()
                .filter(n -> n.getId()
                        .equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Note not found"));

        noteToUpdate.setTitle(nUpdate.getTitle());
        noteToUpdate.setText(nUpdate.getText());
        noteToUpdate.setModificationDate(LocalDateTime.now());
        save(notes);

        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        List<Note> notes = getAll();

        for (Note note: notes) {
            if (note.getId().equals(id)) {
                notes.remove(note);
                save(notes);
                return true;
            }
        }

        return false;
    }

    @Override
    public void save(List<Note> notes) {
        List<String> lines = new ArrayList<>();

        for (Note note: notes) lines.add(mapper.toOutput(note));

        try (FileWriter writer = new FileWriter(connector.db_path, false)) {
            for (String line: lines) writer.write(line + "\n");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
