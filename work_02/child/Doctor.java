package work_02.child;

import work_02.parent.Animal;
import work_02.parent.Runnable;
import work_02.parent.Speakable;
import work_02.parent.Swimable;

public class Doctor extends Animal implements Runnable, Speakable, Swimable {
    private final String name;

    public Doctor(String name, int legsCount) {
        super("", legsCount);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSpeedRun() {
        return 10;
    }

    @Override
    public int getSpeedSwim() {
        return 2;
    }

    @Override
    public void speak() {
        System.out.printf("%s %s говорит что-то на врачебном.%n", getType(), getName());
    }

    @Override
    public void hunt() {}
}
