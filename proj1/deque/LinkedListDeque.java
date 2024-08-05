package deque;

public class LinkedListDeque<T> {
    private class Node {
        T item;
        Node next;
        Node prev;

        //constructor
        Node(T item) {
            this.item = item;
            this.next = null;
            this.prev = null;
        }
    }

    private int size;
    private Node first;
    private Node last;

    public LinkedListDeque() {
        first = null;
        last = null;
        size = 0;
    }

    public void addFirst(T item) {
        //add item at the first place
        Node newNode = new Node(item);
        if (size == 0) {
            first = newNode;
            last = newNode;
        } else {
            first.prev = newNode;
            newNode.next = first;
            first = newNode;
        }
        size += 1;
    }

    public void addLast(T item) {
        //add item at the last place
        Node newNode = new Node(item);
        if (size == 0) {
            last = newNode;
            first = newNode;
        } else {
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
        }
        size += 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void printDeque() {

    }

    public T removeFirst() {
        if (size == 0) {
            return null;
        }
        Node removal = first;
        if (size == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            first.prev = null;
        }
        size -= 1;
        return removal.item;
    }

    public T removeLast() {
        if (size == 0) {
            return null;
        }
        Node removal = last;
        if (size == 1) {
            first = null;
            last = null;
        } else {
            last = last.prev;
            last.next = null;
        }
        size -= 1;
        return removal.item;
    }

}
/**
    public T get(int index){
    // return an item in destined place, use iteration
        return
    }


    public boolean equals(Object o){
        return
    }
*/

