package work_07.controller.impl;

import work_07.controller.Controller;
import work_07.model.Note;
import work_07.model.repository.Operational;

import java.util.Optional;

public class NoteController extends Controller<Note> {
    public NoteController(Operational<Note> repository) {
        this.repository = repository;
    }

    @Override
    public Note get(String id) throws RuntimeException {
        Optional<Note> note = repository.get(Long.parseLong(id));

        if (note.isPresent()) return note.get();

        throw new RuntimeException("Note not found");
    }

    @Override
    public void update(String id, Note nUpdate) {
        try {
            repository.update(Long.parseLong(id), nUpdate);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
