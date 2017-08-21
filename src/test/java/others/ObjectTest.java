package others;

import org.junit.Test;

import java.util.Objects;

/**
 * Created by Linuxea on 2017/8/21.
 */
public class ObjectTest {

	/**
	 * 一个对象B指向另外一个对象A
	 * 将B指向Null，并不会影响到A
	 */
	@Test
	public void test1(){
		Object obj = new Object();
		System.out.println(obj);
		Object object = obj;
		object = null;
		System.out.println(obj);
	}
}
