package algorithm;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author linuxea
 * @date 2018/5/24
 */
public class MaxSubSetTest {
	
	private int[] integers;
	
	@Before
	public void before() {
		integers = IntStream.range(0, 1000099785).limit(888).toArray();
		System.out.println(Arrays.toString(integers));
	}
	
	@Test
	public void method1() {
		new MaxSubSet().maxSubOne(integers);
	}
	
	@Test
	public void method2() {
		new MaxSubSet().maxSubTwo(integers);
	}
	
}