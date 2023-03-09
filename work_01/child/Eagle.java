package child;

import parent.Animal;

public class Eagle extends Animal {
    public Eagle(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: уии!%n", getType());
    }
    
}
