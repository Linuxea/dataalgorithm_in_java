package others;

import org.junit.Test;

/**
 * Created by Linuxea on 2017/8/21.
 */
public class StringTest {

	@Test
	public void test(){
		String string = "magic String";
		String string2 = string;
		string2 = "copy magic String";
		System.out.println(string);
		System.out.println(string2);
	}

}
