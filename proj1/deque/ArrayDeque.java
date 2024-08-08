package deque;

public class ArrayDeque<T> {
    private static final int INITIAL_CAPACITY = 8;
    private T[] array;
    private int size;
    //choose the starting position of the array, can be any number.
    private int first = 3;
    private int last = 3;
    private int capacity = INITIAL_CAPACITY;
    public ArrayDeque(){
        array = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    private void resize() {
        //create a new newArray with capacity doubled
        capacity *= 2;
        T[] newArray = (T[]) new Object[capacity];
        //copy the two halves of array, split by first index
        System.arraycopy(array,0, newArray, 0,first);
        System.arraycopy(array, first, newArray, first+size, size-first);
        array = newArray;
        //change first index to adopt the new array
        first = first + size;
    }

    public void addFirst(T item) {
        //add item to the font of current first index
        if (size == capacity) {
            //resize if reach capacity
            resize();
        }

        if (array[first] == null) {
            //assign item to array when it is empty
            array[first] = item;
        }
        else if (first == 0){
            //go to the bottom if index is 0
            first = capacity-1;
        }
        else {
            //decrease the first index by 1
            first -= 1;
        }
        array[first] = item;
        size += 1;
    }

    public void addLast(T item) {
        //add item after the current last index
        if (size == capacity) {
            //resize if reach capacity
            resize();
        }

        if (array[last] == null) {
            //assign item to array when it is empty
            array[last] = item;
        }
        else if (last == capacity-1){
            //go to the head if index is capacity-1
            last = 0;
        }
        else {
            //decrease the first index by 1
            last += 1;
        }
        array[last] = item;
        size += 1;
    }

    public T removeFirst() {
        if (array[first] == null) {
            return null;
        }
        else {
            T removal = array[first];
            //null out last position in the array
            array[first] = null;
            if (first == last) {
                //do nothing
            }
            else if (first == capacity-1) {
                first = 0;
            }
            else{
                first += 1;
            }
            size -= 1;
            return removal;
        }
    }

    public T removeLast() {
        if (array[last] == null) {
            return null;
        }
        else {
            T removal = array[last];
            //null out last position in the array
            array[last] = null;

            if (first == last) {
                //do nothing
            }
            else if (last == 0) {
                last = capacity - 1;
            }
            else{
                last -= 1;
            }
            size -= 1;
            return removal;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void printDeque() {

    }

    public T get(int index) {
        int position = first + index;
        if (position >= capacity) {
            position -= capacity;
        }
        return array[position];
    }
}


