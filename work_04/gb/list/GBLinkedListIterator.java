package work_04.gb.list;

import java.util.Iterator;

// переписываем итерацию под наш LinkedList
public class GBLinkedListIterator<T> implements Iterator<T> {
    private GBNode<T> current;

    public GBLinkedListIterator(GBNode<T> current) {
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T res = current.data;
        current = current.next;
        return res;
    }
}
