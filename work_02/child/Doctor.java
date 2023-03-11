package work_02.child;

import work_02.parent.Diseaseable;
import work_02.parent.Runnable;
import work_02.parent.Speakable;
import work_02.parent.Swimable;

public class Doctor implements Diseaseable, Runnable, Speakable, Swimable {
    private final String name;

    public Doctor(String name, int legsCount) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public int getSpeedRun() {
        return 10;
    }

    @Override
    public int getSpeedSwim() {
        return 3;
    }

    @Override
    public void speak() {
        System.out.printf("%s %s говорит что-то на врачебном.%n", getType(), getName());
    }

    @Override
    public void getIll() {
        System.out.printf("%s %s заболел простудой", getType(), getName());
    }
}
