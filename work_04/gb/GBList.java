package work_04.gb;

// наследуем Iterable для дальнейшей возможности пробежаться по листу форичем
public interface GBList<T> extends Iterable<T> {
    GBList<T> add(T data);

    GBList<T> add(int index, T data);

    void remove(int index);

    T get(int index);

    int size();

    void update(int index, T data);
}
