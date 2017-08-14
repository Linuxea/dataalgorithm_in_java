package tree;

import org.junit.Test;

/**
 * Created by Linuxea on 2017-08-15.
 */
public class BinaryTreeTest {

    @Test
    public void putTest(){
        BinaryTree<Integer> integerBinaryTree = new BinaryTree<>();
        BinaryTree root = integerBinaryTree.put(null,1);
        integerBinaryTree.put(root,2);
        integerBinaryTree.put(root,3);
        integerBinaryTree.put(root,-1);
    }

}
