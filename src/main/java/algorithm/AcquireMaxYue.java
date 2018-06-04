package algorithm;

/**
 * 求最大公约数最基础版
 *
 * @author linuxea
 * @date 2018/6/5
 */
public class AcquireMaxYue {
	
	public void getMaxYue(int a, int b) {
		int result;
		if (a > b) {
			result = gcd(a, b);
		} else {
			result = gcd(b, a);
		}
		System.out.println(result);
	}
	
	
	public void getMaxYue2(int a, int b) {
		int result;
		if (a > b) {
			result = gcd2(a, b);
		} else {
			result = gcd2(b, a);
		}
		System.out.println(result);
	}
	
	/**
	 * 两个正整数a和b（a>b），它们的最大公约数等于a除以b的余数c和b之间的最大公约数
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	private int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		} else {
			return gcd(b, a % b);
		}
	}
	
	/**
	 * 两个正整数a和b（a>b），它们的最大公约数等于a-b的差值c和较小数b的最大公约数
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	private int gcd2(int a, int b) {
		if (a == b) {
			return b;
		}
		if (a < b) {
			return gcd2(b - a, a);
		} else {
			return gcd2(a - b, b);
		}
	}
	
}
