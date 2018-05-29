package datastructure.sort;

import com.google.common.primitives.Ints;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author linuxea
 * @date 2018/5/29
 */
public class SelectionSortTest {
	
	@Test
	public void test() {
		int[] ints = ThreadLocalRandom.current().ints(16, -99, 99).toArray();
		List<Integer> integers = Ints.asList(ints);
		SelectionSort selectionSort = new SelectionSort(integers);
		selectionSort.sort();
	}
	
}