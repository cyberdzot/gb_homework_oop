package work_02;

import work_02.child.Cat;
import work_02.child.Dog;
import work_02.child.Duck;
import work_02.child.HumanExtendsAnimal;
import work_02.parent.Animal;
import work_02.parent.Speakable;
import work_02.parent.VeterinaryClinic;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        clinic
                .addAnimal(new Cat("Барсик", "серый"))
                .addAnimal(new Duck("Дональд", "пёстрый", 2))
                .addAnimal(new Dog("Барбос", "белый"))
                .addAnimal(new HumanExtendsAnimal("Брэд", 2));

        for (Animal animal : clinic.getANIMALS()) {
            animal.getIll();
        }

        System.out.println(clinic.getSpeakable());
        clinic.getSpeakable().forEach(Speakable::speak);
    }
}
