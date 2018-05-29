package datastructure.sort;

import org.junit.Test;

import java.util.PriorityQueue;

/**
 * @author linuxea
 * @date 2018/5/29
 */
public class HeapSortTest {
	
	@Test
	public void test() {
		PriorityQueue<Integer> integers = new PriorityQueue<>((o1, o2) -> {
			if (o1 < o2) {
				return 1;
			} else if (o1 > o2) {
				return -1;
			}
			return 0;
		});
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);
		integers.add(6);
		while (true) {
			Integer poll = integers.poll();
			if (null == poll) {
				break;
			} else {
				System.out.println(poll);
				System.out.println(integers);
			}
		}
		
		HeapSort heapSort = new HeapSort(integers);
		heapSort.sort();
		
	}
	
}