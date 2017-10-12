package datastructure.linkedlist;

import org.junit.Test;

/**
 * Created by Linuxea on 2017-08-21.
 */
public class LinkedListTest {

    @Test
    public void test1(){
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.print();
    }

}
