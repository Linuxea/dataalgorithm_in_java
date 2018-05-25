package datastructure.linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author linuxea
 * @date 2018/5/25
 */
public class InsertHeadLinkedTest {
	
	private InsertHeadLinked<String> insertHeadLinked;
	
	@Before
	public void before() {
		insertHeadLinked = new InsertHeadLinked<>();
		insertHeadLinked.insert("a");
		insertHeadLinked.insert("b");
		insertHeadLinked.insert("c");
		insertHeadLinked.insert("d");
		insertHeadLinked.insert("e");
		insertHeadLinked.insert("f");
		assertEquals(6, insertHeadLinked.getLength());
	}
	
	@After
	public void after() {
		insertHeadLinked = null;
	}
	
	@Test
	public void printTest() {
		insertHeadLinked.print();
	}
	
}