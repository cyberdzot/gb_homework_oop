package work_04;

import work_04.gb.list.GBLinkedList;

public class Main {
    public static void main(String[] args) {
        // инициализация уже с одним элементом
        GBLinkedList<String> test_list = new GBLinkedList<>("s1");

        test_list
                .add("s2")
                .add("s3")
                .add("s4")
                .add(10, "s11"); // для проверки, не должно добавится туда где нет соседей =)

        test_list.addFirst("s5");
        test_list.addLast("s10");

        System.out.println(test_list);
        test_list.remove(3);
        System.out.println(test_list);
        test_list.removeFirst();
        System.out.println(test_list);
        test_list.removeLast();
        System.out.println(test_list);

        test_list.update(0, "s10");
        System.out.println(test_list);

        System.out.println("Размер списка: " + test_list.size());
        System.out.println("В индексе(0) значение: " + test_list.get(0));
    }
}
