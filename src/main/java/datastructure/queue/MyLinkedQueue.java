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
	
	
	public int first() {
		//TODO
		return 1;
	}
	
	public int last() {
		//TODO
		return 1;
	}
	
	
	private static class Queue<T> {
		
		T data;
		Queue<T> next;
		
		public Queue(T data) {
			this.data = data;
		}
	}
	
}
