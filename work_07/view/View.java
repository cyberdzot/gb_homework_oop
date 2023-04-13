package work_07.view;

import work_07.controller.Controller;

public abstract class View<T> {
    protected Controller<T> controller;

    public abstract void run();
}
