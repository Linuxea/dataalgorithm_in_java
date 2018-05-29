package datastructure.sort;

import java.util.List;

/**
 * @author linuxea
 * @date 2018/5/29
 */
public class SelectionSort {
	
	private List<Integer> integers;
	
	public SelectionSort(List<Integer> integers) {
		this.integers = integers;
	}
	
	public void sort() {
		for (int i = 0; i < integers.size(); i++) {
			int minIndex = i;
			for (int j = i; j < integers.size(); j++) {
				if (integers.get(minIndex) > integers.get(j)) {
					minIndex = j;
				}
			}
			// swap
			int temp = integers.get(i);
			integers.set(i, integers.get(minIndex));
			integers.set(minIndex, temp);
		}
		
		System.out.println(integers);
	}
}
