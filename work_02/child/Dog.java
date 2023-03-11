package work_02.child;

import work_02.parent.Animal;
import work_02.parent.Speakable;

public class Dog extends Animal implements Speakable {

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
}
