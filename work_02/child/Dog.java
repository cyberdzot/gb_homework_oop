package work_02.child;

import work_02.parent.Animal;
import work_02.parent.Runnable;
import work_02.parent.Speakable;
import work_02.parent.Swimable;

public class Dog extends Animal implements Speakable, Runnable, Swimable {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s гавкает!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        toPlay();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }

    @Override
    public int getSpeedRun() {
        return 30;
    }

    @Override
    public int getSpeedSwim() {
        return 3;
    }
}
