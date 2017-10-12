package datastructure.immutable;

import java.util.Arrays;

/**
 * Created by Linuxea on 2017/8/21.
 * 不可变类
 */
public class MyImmutable {


	public static void main(String[] argc){
		char[] values = {'a','b','c','d'};
		FakeString fakeString = new FakeString(values);
		System.out.println(fakeString);
		FakeString fakeString1 = fakeString.get();
		System.out.println(fakeString == fakeString1); // must be false
	}

}

final class FakeString implements Cloneable{
	private final char[] values;

	public FakeString(char[] values) {
		this.values = values;
	}

	public FakeString() {
		values = "".toCharArray();
	}

	/**
	 * return a copy
	 * @return
	 */
	public final FakeString get(){
		return new FakeString(this.values);
	}

	@Override
	public String toString() {
		return "FakeString{" +
				"values=" + Arrays.toString(values) +
				'}';
	}
}