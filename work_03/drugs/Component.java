package work_03.drugs;

public class Component {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Component{name='" + name + "\', weight='" + weight + "\', power=" + power + '}';
    }

    // по умолчанию сравнивает ссылки на поля объекта
    // задаём пробежку по всем полям объекта для точного сравнения
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Component component = (Component) obj;

        return this.name.equals(component.getName())
                && this.weight.equals(component.getWeight())
                && this.power == component.getPower();
    }

    // по умолчанию адрес объекта в памяти
    // генерируем свой "адрес" объекта из его полей
    @Override
    public int hashCode() {
        int res = name == null ? 0 : name.hashCode();
        res += weight == null ? 0 : weight.hashCode();
        res += power;
        return res;
    }
}
