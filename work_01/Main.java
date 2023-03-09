import parent.Animal;
import child.Dog;
import child.Duck;
import child.Cat;
import child.Eagle;
import child.Whale;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("_________________main_________________");

        Animal animal = new Animal();
        Animal vaska = new Cat("Васька", "серый");
        Duck duck = new Duck("Пёстрый", 2);
        Dog dog = new Dog("Шарик", "рыжий");
        Eagle eagle = new Eagle("Орлик", 2);
        Whale whale = new Whale("Кит", 2);

        List<Animal> animals = new ArrayList<>();
        animals.add(vaska);
        animals.add(duck);
        animals.add(dog);
        animals.add(animal);
        animals.add(eagle);
        animals.add(whale);
        animals.forEach(Animal::speak);

        System.out.println("--------лётчики------------");
        for (Animal a : animals) {
            if (a instanceof Duck) {
                ((Duck) a).fly();
            }
        }

        System.out.println("--------охота------------");
        vaska.hunt();
    }
}
