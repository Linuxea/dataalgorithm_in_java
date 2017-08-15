package tree;

import org.junit.Test;

/**
 * Created by Linuxea on 2017-08-15.
 */
public class BinaryTreeTest {

    @Test
    public void putTest(){
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		BinaryTree. Node root = binaryTree.put(null, 1);
		binaryTree.put(root, 2);
		binaryTree.put(root, 3);
		binaryTree.put(root, -9);

		binaryTree.print(root);
    }

}
