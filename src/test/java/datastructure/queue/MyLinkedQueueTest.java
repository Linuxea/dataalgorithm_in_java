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
		assertEquals(3, myLinkedQueue.size());
	}
	
	@Test
	public void testGet() {
		myLinkedQueue.add(1);
		myLinkedQueue.add(2);
		myLinkedQueue.add(3);
		assertEquals(1, myLinkedQueue.get(1));
		assertEquals(0, myLinkedQueue.get(4));
	}
	
	@Test
	public void testFirst() {
		myLinkedQueue.add(1);
		myLinkedQueue.add(2);
		myLinkedQueue.add(3);
		assertEquals(Integer.valueOf(1), myLinkedQueue.first());
		assertEquals(Integer.valueOf(2), myLinkedQueue.first());
		assertEquals(Integer.valueOf(3), myLinkedQueue.first());
	}
	
}