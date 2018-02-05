package datastructure.queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author linuxea
 * @date 2018/2/5
 */
public class MyLinkedQueueTest {
	
	MyLinkedQueue<Integer> myLinkedQueue = new MyLinkedQueue<>();
	
	@Test
	public void testAdd() {
		myLinkedQueue.add(1);
		myLinkedQueue.add(2);
		myLinkedQueue.add(3);
		assertEquals(myLinkedQueue.size(), 3);
	}
	
	@Test
	public void testGet() {
		myLinkedQueue.add(1);
		myLinkedQueue.add(2);
		myLinkedQueue.add(3);
		assertEquals(myLinkedQueue.get(1), 1);
		assertEquals(myLinkedQueue.get(4), 0);
	}
	
}