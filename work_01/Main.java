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
        System.out.println("_________________start code_________________");

        Animal vaska = new Cat("Васька", "серый");
        Animal duck = new Duck("пёстрый", 2);
        Animal dog = new Dog("Шарик", "рыжий");
        Animal eagle = new Eagle("пустынный", 2);
        Animal whale = new Whale("серый", 2);

        List<Animal> animals = new ArrayList<>();
        animals.add(vaska);
        animals.add(duck);
        animals.add(dog);
        animals.add(eagle);
        animals.add(whale);

        System.out.println("---------ходьба-----------");
        animals.forEach(Animal::toGo);
        System.out.println("---------полёт-----------");
        animals.forEach(Animal::fly);
        System.out.println("---------плавание-----------");
        animals.forEach(Animal::swim);
    }
}
