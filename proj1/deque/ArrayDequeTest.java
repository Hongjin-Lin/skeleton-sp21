package deque;

import org.junit.Test;
import java.lang.reflect.Array;

import static org.junit.Assert.*;
/**
 * Created by hug.
 */
public class ArrayDequeTest {

    public static void main(String[] args) {
//        resiezeTest();
 //       sizeTest();
    }

    @Test
    public void sizeTest() {

    }

    @Test
    public void resizeTest(){


    }

    @Test
    public void addFirstTest() {

    }

    @Test
    public void addLastTest() {

    }

    @Test
    public void removeFirstTest() {

    }

    @Test
    public void removeLastTest() {

    }

    @Test
    public void isEmptyTest() {
        ArrayDeque<Integer> array = new ArrayDeque<Integer>();
        assertTrue(array.isEmpty());
        array.addFirst(1);
        assertFalse(array.isEmpty());
        array.removeFirst();
        assertTrue(array.isEmpty());
    }

    @Test
    public void printDequeTest() {

    }

    @Test
    public void getTest(){
        ArrayDeque<Integer> a1 = new ArrayDeque<Integer>();
        a1.addFirst(1);
        a1.addLast(2);
        a1.addFirst(0);
        a1.addLast(3);
        a1.addLast(4);
        a1.addFirst(-1);
        a1.addLast(5);
        a1.addLast(6);
        assertEquals((Integer) 6,a1.get(7));
        a1.addLast(7);
        a1.addLast(8);
        assertEquals((Integer) 8,a1.get(9));
    }
}