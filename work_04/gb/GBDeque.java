package work_04.gb;

// наследуем Iterable для дальнейшей возможности пробежаться по листу форичем
public interface GBDeque<T> extends Iterable<T> {
    boolean isEmpty();

    void addFirst(T data);

    void addLast(T data);

    void removeFirst();

    void removeLast();
}
