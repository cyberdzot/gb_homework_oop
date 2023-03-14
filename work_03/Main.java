package work_03;

import work_03.drugs.Component;
import work_03.drugs.impl.CatDrug;
import work_03.drugs.impl.components.Azitron;
import work_03.drugs.impl.components.Water;
import work_03.drugs.impl.components.Penicellin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Component lowAzitron = new Azitron("Азитрон", "2", 4);
        Component mediumAzitron = new Azitron("Азитрон", "4", 8);
        Component highAzitron = new Azitron("Азитрон", "8", 16);

        Component lowWater = new Water("Вода", "20", 12);
        Component mediumWater = new Water("Вода", "40", 24);
        Component highWater = new Water("Вода", "80", 48);

        Component lowPenicellin = new Penicellin("Пенициллин", "18", 6);

        // компоненты для кошачьих лекарств
        List<Component> componentsCat1 = List.of(lowAzitron, lowWater);
        List<Component> componentsCat2 = List.of(mediumAzitron, lowPenicellin);
        List<Component> componentsCat3 = List.of(mediumWater, highAzitron);
        List<Component> componentsCat4 = List.of(highWater, highAzitron);

        // перебор компонентов кошачьего лекарства
        CatDrug drug = new CatDrug(componentsCat1);
        for (Component component : drug)
            System.out.println(component);

        // кошачьи лекарства
        CatDrug drug1 = new CatDrug(componentsCat2);
        CatDrug drug2 = new CatDrug(componentsCat3);
        CatDrug drug4 = new CatDrug(componentsCat4);

        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug);
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug4);
        // сортировка всех кошачьих лекарств по возрастанию силы
        Collections.sort(drugs);

        System.out.println(drugs);
    }
}
