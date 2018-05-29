package datastructure.sort;

import java.util.PriorityQueue;

/**
 * @author linuxea
 * @date 2018/5/29
 */
public class HeapSort {
	
	private PriorityQueue<Integer> priorityQueue;
	
	public HeapSort(PriorityQueue<Integer> priorityQueue) {
		this.priorityQueue = priorityQueue;
	}
	
	public void sort() {
		System.out.println(priorityQueue);
	}
}
