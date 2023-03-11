package work_02;

import java.util.ArrayList;
import java.util.List;

import work_02.child.Cat;
import work_02.child.Doctor;
import work_02.child.Dog;
import work_02.child.Duck;
import work_02.child.Human;
import work_02.child.HumanExtendsAnimal;
import work_02.parent.Animal;
import work_02.parent.Diseaseable;
import work_02.parent.Speakable;
import work_02.parent.Runnable;
import work_02.parent.Flyable;
import work_02.parent.Swimable;
import work_02.parent.VeterinaryClinic;

public class Main {
    public static void main(String[] args) {
        System.out.println("____________start_____________");

        // создадим животный мир
        Cat cat = new Cat("Барсик", "серый");
        Duck duck = new Duck("Дональд", "пёстрый", 2);
        Dog dog = new Dog("Барбос", "белый");
        HumanExtendsAnimal humanEx = new HumanExtendsAnimal("Брэд", 2);
        Human human = new Human("Гость");
        Doctor doctor = new Doctor("Костоправ", 2);

        // добавим каждый объект в логичный список
        // людей и врачей в этот список не впихиваем!
        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic
                .addAnimal(cat)
                .addAnimal(dog)
                .addAnimal(duck)
                .addAnimal(humanEx);

        List<Diseaseable> humans = new ArrayList<>();
        humans.add(human);
        humans.add(humanEx);
        humans.add(doctor);

        List<Flyable> flyable = new ArrayList<>();
        flyable.add(duck);

        List<Runnable> runnable = new ArrayList<>();
        runnable.add(cat);
        runnable.add(duck);
        runnable.add(dog);
        runnable.add(human);
        runnable.add(humanEx);
        runnable.add(doctor);

        List<Swimable> swimable = new ArrayList<>();
        swimable.add(duck);
        swimable.add(dog);
        swimable.add(human);
        swimable.add(humanEx);
        swimable.add(doctor);

        // вывод
        System.out.println("\nБолеющие животные: ");
        for (Animal animal : clinic.getANIMALS())
            animal.getIll();

        // людей не будет в списке клиники, нужно отдельный список делать
        System.out.println("\nГоворящие животные: ");
        clinic.getSpeakable().forEach(Speakable::speak);

        System.out.println("\nБегающие: ");
        // runnable.forEach(r -> System.out.println(Runnable::getRunSpeed));
        for (Runnable r : runnable)
            System.out.println(r.getType() + " бегает со скоростью: " + r.getSpeedRun());

        System.out.println("\nЛетающие: ");
        for (Flyable f : flyable)
            System.out.println(f.getType() + " летает со скоростью: " + f.getSpeedFly());

        System.out.println("\nПлавающие: ");
        for (Swimable s : swimable)
            System.out.println(s.getType() + " плавает со скоростью: " + s.getSpeedSwim());
    }
}
