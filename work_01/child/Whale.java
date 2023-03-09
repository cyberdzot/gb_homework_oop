package child;

import parent.Animal;

public class Whale extends Animal {
    public Whale(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: бульк!%n", getType());
    }
    
    @Override
    public void toGo() {
        // ходить не умеем
    }

    @Override
    public void fly() {
        // летать не умеем
    }
}
