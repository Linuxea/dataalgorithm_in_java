package tree;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Linuxea on 2017-08-15.
 */
public class BinaryTreeTest {

	BinaryTree<Integer> binaryTree = new BinaryTree<>();
	BinaryTree. Node root = binaryTree.put(null, 1);

	@Before
	public void before(){
		binaryTree.put(root, 2);
		binaryTree.put(root, 3);
		binaryTree.put(root, -9);
		binaryTree.put(root, 100);
		binaryTree.put(root, 47);
		binaryTree.put(root, -7);
		binaryTree.put(root, 36);
		System.out.println("水平遍历开始");
		binaryTree.levelPrint(root);
		System.out.println("\n水平遍历结束");
	}

    @Test
    public void prePrintTest(){
		System.out.println("先序遍历开始");
		binaryTree.prePrint(root);
		System.out.println("\n先序遍历结束");
    }

	@Test
	public void middlePrintTest(){
		System.out.println("中序遍历开始");
		binaryTree.middlePrint(root);
		System.out.println("\n中序遍历结束");
	}

	@Test
	public void afterPrintTest(){
		System.out.println("后序遍历开始");
		binaryTree.afterPrint(root);
		System.out.println("\n后序遍历结束");
	}

}
