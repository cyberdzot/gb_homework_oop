package work_03.drugs;

import java.util.Iterator;
import java.util.List;

// абстрактный потому что нужно описать поля
public abstract class Drug implements Iterable<Component>, Comparable<Drug> {
    private List<Component> components;
    int index;

    @Override
    public int compareTo(Drug o) {
        // if (getDrugPower() > o.getDrugPower())
        //     return 1;
        // else if(getDrugPower() < o.getDrugPower())
        //     return -1;
        // else
        //     return 0;

        // упрощённая конструкция для кода выше
        return Integer.compare(getDrugPower(), o.getDrugPower());
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            public boolean hasNext() {
                return index < components.size();
            }

            public Component next() {
                return components.get(index++);
            }
        };
    }

    public Drug(List<Component> component) {
        this.components = component;
        this.index = 0;
    }

    public int getDrugPower() {
        int power = 0;
        for(Component component: components){
            power += component.getPower();
        }
        return power;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {компоненты: " + components + ", сила: " + getDrugPower() + "}\n";
    }
}
