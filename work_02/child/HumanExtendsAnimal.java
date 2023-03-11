package work_02.child;

import work_02.parent.Animal;
import work_02.parent.Runnable;
import work_02.parent.Speakable;
import work_02.parent.Swimable;

/**
 * Шуточный класс, в котором некий "человек"  наследует от животного его поведение и состояние.
 * Класс создан в учебных целях и не несёт в себе скрытых смыслов и оскорблений :)
 */
public class HumanExtendsAnimal extends Animal implements Speakable, Swimable, Runnable {
    private final String name;
    private final int legsCount;

    public HumanExtendsAnimal(String name, int legsCount) {
        super("", legsCount);
        this.name = name;
        this.legsCount = legsCount;
    }

    @Override
    public void speak() {
        System.out.printf("%s %s что-то бормочет.%n", getType(), getName());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public int getSpeedSwim() {
        return 6;
    }

    @Override
    public int getSpeedRun() {
        return 6;
    }
}
