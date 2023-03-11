package work_02.parent;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    /**
     * Список животных - клиентов клиники.
     */
    private final List<Animal> ANIMALS;

    public VeterinaryClinic() {
        this.ANIMALS = new ArrayList<>();
    }

    public VeterinaryClinic addAnimal(Animal animal) {
        ANIMALS.add(animal);
        return this;
    }

    public List<Animal> getANIMALS() {
        return ANIMALS;
    }

    // получить всех говорящих
    public List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Speakable) {
                result.add((Speakable) animal);
            }
        }
        return result;
    }

    // получить всех плавающих
    public List<Swimable> getSwimable() {
        List<Swimable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Swimable) {
                result.add((Swimable) animal);
            }
        }
        return result;
    }

    // получить всех бегающих
    public List<Runnable> getRunnable() {
        List<Runnable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Runnable) {
                result.add((Runnable) animal);
            }
        }
        return result;
    }

    // получить всех летающих
    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Flyable) {
                result.add((Flyable) animal);
            }
        }
        return result;
    }

    // получить всех болеющих
    public List<Diseaseable> getDiseaseable() {
        List<Diseaseable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Diseaseable) {
                result.add((Diseaseable) animal);
            }
        }
        return result;
    }
}
