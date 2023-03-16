package work_03;

import java.util.ArrayList;
// import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import work_03.drugs.Component;
import work_03.drugs.impl.CatDrug;
import work_03.drugs.impl.components.Azitron;
import work_03.drugs.impl.components.Penicillin;
import work_03.drugs.impl.components.Water;

public class Main {
    public static void main(String[] args) {
        Component lowAzitron = new Azitron("Азитрон", "2", 12);
        Component mediumAzitron = new Azitron("Олд-Азитрон", "2", 12);
        Component highAzitron = new Azitron("Про-Азитрон", "8", 48);

        Component lowWater = new Water("Вода", "20", 12);
        Component mediumWater = new Water("Вода", "40", 24);
        Component highWater = new Water("Вода", "80", 48);

        Component penicillin = new Penicillin("Пенициллин", "18", 12);
        Component penicillinPlus = new Penicillin("Пенициллин", "18", 12);
        Component penicillinPro = new Penicillin("Пенициллин-Про", "18", 12);

        // компоненты для кошачьих лекарств
        List<Component> componentsCat1 = List.of(penicillin, mediumAzitron);
        List<Component> componentsCat2 = List.of(lowWater, lowAzitron);
        List<Component> componentsCat3 = List.of(mediumWater, highAzitron);
        List<Component> componentsCat4 = List.of(highWater, highAzitron);

        // перебор компонентов кошачьего лекарства
        CatDrug drug = new CatDrug(componentsCat1);
        // for (Component component : drug)
        //     System.out.println(component);

        // кошачьи лекарства
        CatDrug drug1 = new CatDrug(componentsCat2);
        CatDrug drug2 = new CatDrug(componentsCat3);
        CatDrug drug4 = new CatDrug(componentsCat4);

        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug4);
        drugs.add(drug);
        drugs.add(drug2);
        drugs.add(drug1);

        // System.out.println(drugs);
        // сортировка всех кошачьих лекарств по возрастанию силы
        // Collections.sort(drugs);
        // System.out.println(drugs);
        
        Set<Component> components = new HashSet<>();
        components.add(penicillin);
        components.add(penicillinPro);
        components.add(penicillinPlus);

        System.out.println(components);
    }
}
