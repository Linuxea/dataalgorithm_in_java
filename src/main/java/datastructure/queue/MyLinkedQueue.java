package datastructure.queue;

/**
 * 队列的链表实现
 *
 * @author linuxea
 * @date 2018/2/5
 */
public class MyLinkedQueue<T extends Comparable<T>> {
	
	private Queue<T> head;
	private Queue<T> tail;
	
	private int size;
	
	public MyLinkedQueue() {
	}
	
	public synchronized void add(T t) {
		Queue<T> newNode = new Queue<>(t);
		if (null == head) {
			head = newNode;
		}
		// TODO
		tail = newNode;
		size++;
	}
	
	public int get(T t) {
		Queue<T> temp = head;
		for (; ; ) {
			if (null == temp) {
				return 0;
			}
			if (temp.data.compareTo(t) == 0) {
				return 1;
			} else {
				temp = temp.next;
			}
		}
	}
	
	public synchronized int size() {
		return size;
	}
	
	public int remove(T t) {
		if (get(t) == 0) {
			return 0;
		}
		//TODO
		return 1;
	}
	
	
	public T first() {
		if (null == head) {
			return null;
		}
		T t = head.data;
		if (head.next != null) {
			head = head.next;
		}
		
		return t;
	}
	
	public T last() {
		if (null == head || null == tail) {
			return null;
		}
		T t = tail.data;
		
		return t;
	}
	
	
	private static class Queue<T> {
		
		T data;
		Queue<T> next;
		
		public Queue(T data) {
			this.data = data;
		}
	}
	
}
