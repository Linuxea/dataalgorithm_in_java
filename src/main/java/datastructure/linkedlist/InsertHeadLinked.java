package datastructure.linkedlist;

/**
 * 链表头插法简单版
 *
 * @author linuxea
 * @date 2018/5/25
 */
public class InsertHeadLinked<T> {
	
	private Node<T> first;
	private Node<T> last;
	private int length;
	
	public synchronized void insert(T t) {
		Node<T> newNode = new Node<>(t, null);
		if (null == first) {
			first = newNode;
		}
		if (null == last) {
			last = newNode;
		}
		last.prev = newNode;
		last = newNode;
		length++;
	}
	
	public synchronized void print() {
		Node<T> first = this.first;
		while (null != first) {
			System.out.print(first.data + " >> ");
			first = first.prev;
		}
		System.out.println(" over ");
	}
	
	public synchronized int getLength() {
		return length;
	}
	
	private static class Node<T> {
		T data;
		Node<T> prev;
		
		Node(T data, Node<T> prev) {
			this.data = data;
			this.prev = prev;
		}
	}
	
}
