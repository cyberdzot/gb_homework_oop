package work_02.child;

import work_02.parent.Animal;
import work_02.parent.Flyable;
import work_02.parent.Runnable;
import work_02.parent.Speakable;
import work_02.parent.Swimable;

public class Duck extends Animal implements Speakable, Flyable, Swimable, Runnable {
    private int legsCount;

    public Duck(String name, String color, int legsCount) {
        super(name, color);
        this.legsCount = legsCount;
    }

    public Duck(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void speak() {
        System.out.printf("%s крякает!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
        goToSleep();
    }

    public void fly() {
        System.out.printf("%s полетел!%n", getType());
    }

    @Override
    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public int getSpeedFly() {
        return 20;
    }

    @Override
    public int getSpeedSwim() {
        return 12;
    }

    @Override
    public int getSpeedRun() {
        return 5;
    }
}
