package work_02;

import java.util.ArrayList;
import java.util.List;

import work_02.child.Cat;
import work_02.child.Doctor;
import work_02.child.Dog;
import work_02.child.Duck;
import work_02.child.HumanExtendsAnimal;
import work_02.parent.Speakable;
import work_02.parent.Runnable;
import work_02.parent.VeterinaryClinic;

public class Main {
    public static void main(String[] args) {
        System.out.println("____________start_____________");
        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic
                .addAnimal(new Cat("Барсик", "серый"))
                .addAnimal(new Duck("Дональд", "пёстрый", 2))
                .addAnimal(new Dog("Барбос", "белый"))
                .addAnimal(new HumanExtendsAnimal("Брэд", 2))
                .addAnimal(new Doctor("Костоправ", 2));

        // System.out.println("Болеющие: ");
        // for (Animal animal : clinic.getANIMALS()) {
        // animal.getIll();
        // }

        // System.out.println("Говорящие: ");
        // clinic.getSpeakable().forEach(Speakable::speak);

        System.out.println("Говорящие: ");
        clinic.getSpeakable().forEach(Runnable::getSpeedRun);



        List<Runnable> runnable = new ArrayList<>();
        runnable.add(new Doctor("Костоправ", 2));

        System.out.println("Плавающие: ");
        for (Runnable f : runnable) {
            System.out.println(f.getSpeedRun());
        }
    }
}
