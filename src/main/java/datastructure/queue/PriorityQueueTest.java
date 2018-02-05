package datastructure.queue;

import java.util.PriorityQueue;

/**
 * 优先队列测试及方法区别
 * http://blog.csdn.net/ustcjackylau/article/details/42454779
 *
 * @author linuxea
 * @date 2018/2/5
 */
public class PriorityQueueTest {
	
	private final PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
	
	public static void main(String[] args) {
		PriorityQueueTest priorityQueueTest = new PriorityQueueTest();
		priorityQueueTest.add(1);
		priorityQueueTest.add(2);
		priorityQueueTest.add(3);
		priorityQueueTest.add(4);
		priorityQueueTest.add(5);
		
		Integer size = priorityQueueTest.size();
		System.out.println("size" + size);
		
		Integer peek = priorityQueueTest.peek();
		System.out.println("peek" + peek);
		
		Integer poll = priorityQueueTest.poll();
		System.out.println("poll" + poll);
		
		Integer element = priorityQueueTest.element();
		System.out.println(element);
	}
	
	public boolean add(Integer integer) {
		return priorityQueue.add(integer);
	}
	
	public Integer element() {
		return priorityQueue.element();
	}
	
	public boolean remove(Integer integer) {
		return priorityQueue.remove(integer);
	}
	
	public Integer peek() {
		return priorityQueue.peek();
	}
	
	public Integer poll() {
		return priorityQueue.poll();
	}
	
	public Integer size() {
		return priorityQueue.size();
	}
	
}
