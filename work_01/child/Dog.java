package child;

import parent.Animal;

public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Гав!%n", getType());
    }

    @Override
    public void fly() {
        // летать не умеем
    }
}
