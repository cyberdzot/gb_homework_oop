package work_07.view.impl;

import work_07.controller.Controller;
import work_07.model.Note;
import work_07.util.Commands;
import work_07.view.View;

import java.util.List;
import java.util.Scanner;

public class ConsoleView extends View<Note> {
    public ConsoleView(Controller<Note> controller) {
        this.controller = controller;
    }

    @Override
    public void run() {
        Commands com;

        while (true) {
            String command = prompt("Введите нужную команду\n(CREATE, LIST, GET, UPDATE, DELETE, EXIT): ");
            com = Commands.valueOf(command.toUpperCase());

            switch (com) {
                case CREATE -> {
                    Note note = createNote();
                    controller.create(note);
                }

                case GET -> {
                    String id = prompt("Введите ID записи: ");
                    try {
                        Note note = controller.get(id);
                        System.out.println(note + "\n");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }

                case LIST -> {
                    List<Note> notes = controller.getAll();

                    System.out.println("----------------");

                    for (Note note: notes) {
                        System.out.println(note);
                        System.out.println("----------------");
                    }
                }

                case UPDATE -> {
                    String id = prompt("Введите ID записи: ");
                    controller.update(id, createNote());
                }

                case DELETE -> {
                    String id = prompt("Введите ID записи: ");
                    controller.delete(id);
                }

                case EXIT -> {
                    System.out.println("Завершение работы...");
                    return;
                }
            }
        }
    }

    
    private String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);

        return in.nextLine();
    }

    private Note createNote() {
        String title = prompt("Введите заголовок: ");
        String text = prompt("Введите текст: ");

        return new Note(title, text);
    }
}
