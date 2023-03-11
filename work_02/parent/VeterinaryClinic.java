package work_02.parent;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    /**
     * Список животных - клиентов клиники.
     */
    private final List<Animal> ANIMALS;
    // private final List<Animal> VISITORS;

    public VeterinaryClinic() {
        this.ANIMALS = new ArrayList<>();
        // this.VISITORS = new ArrayList<>();
    }

    // public VeterinaryClinic addVisitors(Animal visitor) {
    //     VISITORS.add(visitor);
    //     return this;
    // }

    public VeterinaryClinic addAnimal(Animal animal) {
        ANIMALS.add(animal);
        return this;
    }

    // public List<Animal> getVISITORS() {
    //     return VISITORS;
    // }

    public List<Animal> getANIMALS() {
        return ANIMALS;
    }

    public List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Speakable) {
                result.add((Speakable) animal);
            }
        }
        return result;
    }

    public List<Swimable> getSwimable() {
        List<Swimable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Swimable) {
                result.add((Swimable) animal);
            }
        }
        return result;
    }

    public List<Runnable> getRunnable() {
        List<Runnable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Runnable) {
                result.add((Runnable) animal);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Flyable) {
                result.add((Flyable) animal);
            }
        }
        return result;
    }
}
