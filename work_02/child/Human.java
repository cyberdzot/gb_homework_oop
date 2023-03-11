package work_02.child;

import work_02.parent.Diseaseable;

public class Human implements Diseaseable {
    private final String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getIll() {
        System.out.printf("%s %s заболел простудой", getType(), getName());
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}
