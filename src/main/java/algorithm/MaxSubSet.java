package algorithm;

/**
 * 最大子列和
 *
 * @author linuxea
 * @date 2018/5/24
 */
public class MaxSubSet {
	
	public static void main(String[] args) {
	
	}
	
	/**
	 * O(n^3)
	 * 暴力
	 *
	 * @param ints
	 */
	public void maxSubOne(int[] ints) {
		int maxSum = 0;
		for (int i = 0; i < ints.length; i++) {
			for (int j = i; j < ints.length; j++) {
				int thisSum = 0;
				for (int k = i; k <= j; k++) {
					thisSum += ints[k];
				}
				if (thisSum > maxSum) {
					maxSum = thisSum;
				}
			}
		}
		System.out.println(maxSum);
	}
	
	/**
	 * O(n)
	 * 在线处理
	 *
	 * @param ints
	 */
	public void maxSubTwo(int[] ints) {
		int thisSum = 0, maxSum = 0;
		for (int i = 0; i < ints.length; i++) {
			thisSum += ints.length;
			if (thisSum > maxSum) {
				maxSum = thisSum;
			} else if (thisSum < 0) {
				thisSum = 0;
			}
		}
		System.out.println(maxSum);
	}
	
}
