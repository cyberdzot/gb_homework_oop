package work_04.gb.list;

import java.util.Iterator;

import work_04.gb.GBDeque;
import work_04.gb.GBList;

// реализация LinkedList
public class GBLinkedList<T> implements GBDeque<T>, GBList<T> {
    private int actualSize;

    {
        actualSize = 0;
    }

    private GBNode<T> head;
    private GBNode<T> tail;

    public GBLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public GBLinkedList(T head) {
        this();
        addFirst(head);
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void addFirst(T data) {
        GBNode<T> temp = new GBNode<>(data);
        if (isEmpty())
            tail = temp;
        else
            head.prev = temp;

        temp.next = head;
        head = temp;
        actualSize++;
    }

    @Override
    public void addLast(T data) {
        GBNode<T> temp = new GBNode<>(data);

        if (isEmpty())
            head = temp;
        else
            tail.next = temp;

        temp.prev = tail;
        tail = temp;
        actualSize++;
    }

    @Override
    public GBLinkedList<T> add(T data) {
        addLast(data);
        return this;
    }

    @Override
    public GBLinkedList<T> add(int index, T data) {
        if (index < 0 || index >= actualSize)
            return this;

        GBNode<T> current = getNode(index);
        GBNode<T> temp = new GBNode<>(data, current.prev, current);
        current.prev.next = temp;
        current.prev = temp;
        return this;
    }

    @Override
    public void removeFirst() {
        remove(0);
    }

    @Override
    public void removeLast() {
        remove(actualSize - 1);
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= actualSize)
            return null;

        return getNode(index).data;
    }

    @Override
    public void remove(int index) {
        GBNode<T> nodeToRemove = getNode(index);

        if (nodeToRemove == null)
            return;

        if (nodeToRemove != head)
            nodeToRemove.prev.next = nodeToRemove.next;
        else
            head = nodeToRemove.next;

        if (nodeToRemove != tail)
            nodeToRemove.next.prev = nodeToRemove.prev;
        else
            tail = nodeToRemove.prev;

        nodeToRemove.prev = nodeToRemove.next = null;
        actualSize--;
    }

    @Override
    public int size() {
        return actualSize;
    }

    @Override
    public Iterator<T> iterator() {
        return new GBLinkedListIterator<>(head);
    }

    @Override
    public void update(int index, T data) {
        GBNode<T> currentNode = getNode(index);
        currentNode.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());

        if (actualSize < 1)
            return sb.toString();

        sb
                .append(" Size: ")
                .append(actualSize)
                .append(" {");

        for (T el : this) {
            sb.append(el);
            sb.append(el == tail.data ? "}" : ", ");
        }

        return sb.toString();
    }

    public GBNode<T> getNode(int index) {
        GBNode<T> current = head;

        for (int pos = 0; current != null && pos < index; pos++) {
            current = current.next;
        }

        return current;
    }
}