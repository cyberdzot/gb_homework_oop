package work_02.child;

import work_02.parent.Diseaseable;
import work_02.parent.Speakable;

public class Human implements Diseaseable, Speakable {
    private final String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void getIll() {
        System.out.printf("%s %s заболел простудой", getType(), getName());
    }

    @Override
    public void speak() {
        System.out.printf("%s %s что-то говорит.%n", getType(), getName());
    }
}
