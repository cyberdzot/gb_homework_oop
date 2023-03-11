package work_02.child;

import work_02.parent.Animal;
import work_02.parent.Speakable;

public class Cat extends Animal implements Speakable {
    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s мяукает!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        toPlay();
        eat();
        toPlay();
        goToSleep();
    }
}
