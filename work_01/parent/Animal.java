package parent;

public class Animal {
    private String name;
    private final String color;
    private int legsCount;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        this.legsCount = 4;
    }

    public Animal(String color, int legsCount) {
        this("Безымянный", color);
        this.legsCount = legsCount;
    }

    public Animal() {
        this("Безымянный", "чёрный");
    }

    // добавление методов согласно заданию -----
    public void toGo() {
        System.out.printf("%s: двигается%n", getType());
    }

    public void fly() {
        System.out.printf("%s: летает%n", getType());
    }

    public void swim() {
        System.out.printf("%s: плавает%n", getType());
    }
    // -------------------------------------------

    public void speak() {
        System.out.printf("%s: ...%n", getType());
    }

    public void hunt() {
    }

    // todo: Ниже геттеры и сеттеры. !!! Обратите внимание, не к каждому полю есть
    // сеттер(один из шагов инкапсуляции)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}
