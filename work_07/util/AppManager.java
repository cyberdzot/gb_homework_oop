package work_07.util;

import work_07.controller.Controller;
import work_07.controller.impl.NoteController;
import work_07.model.Note;
import work_07.model.repository.Operational;
import work_07.model.repository.impl.NoteRepository;
import work_07.util.connector.Connector;
import work_07.util.connector.impl.FileDBConnector;
import work_07.view.View;
import work_07.view.impl.ConsoleView;

public class AppManager {
    private Connector connector;
    private Operational<Note> repository;
    private Controller<Note> controller;
    private View<Note> view;

    public AppManager() {
        this.connector = new FileDBConnector();
        this.repository = new NoteRepository(connector);
        this.controller = new NoteController(repository);
        this.view = new ConsoleView(controller);
    }

    public void run() {
        connector.connect();
        view.run();
    }
}
