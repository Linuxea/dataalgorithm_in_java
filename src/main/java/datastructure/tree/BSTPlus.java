package datastructure.tree;

import java.util.Scanner;

/**
 * 完美二叉树
 * Created by Linuxea on 2017-09-30.
 */
public class BSTPlus<T extends Integer> {

    private TreeNode<T> root; // root node

    public static void main(String[] args) {
        BSTPlus<Integer> bstPlus = new BSTPlus<>();
        bstPlus.create();
        System.out.println("\n################");
        bstPlus.prePrint(bstPlus.root);
        System.out.println("\n################");
        bstPlus.midPrint(bstPlus.root);
        System.out.println("\n################");
        bstPlus.postPrint(bstPlus.root);
        System.out.println("\n################");
        bstPlus.mirrorReverse(bstPlus.root);
        System.out.println("递归反转二叉树后:");

        System.out.println("\n################");
        bstPlus.prePrint(bstPlus.root);
        System.out.println("\n################");
        bstPlus.midPrint(bstPlus.root);
        System.out.println("\n################");
        bstPlus.postPrint(bstPlus.root);
        System.out.println("\n################");
        
        System.out.println("The depth of three is:" + bstPlus.explore(bstPlus.root));
    }

    /**
     * 创建接口
     */
    public void create() {
        Scanner scanner = new Scanner(System.in);
        String line;
        while (null != (line = scanner.nextLine()) && !line.equalsIgnoreCase("exit")) {
            root = create(root, (T) Integer.valueOf(line));
        }
    }

    /**
     * 递归创建的节点
     *
     * @param node
     * @param value
     * @return
     */
    private TreeNode<T> create(TreeNode<T> node, T value) {
        if (node == null) {
            node = new TreeNode<>(value);
            return node;
        }

        if (value.compareTo(node.getData()) > 0) {
            node.setRight(create(node.getRight(), value));
        } else if (value.compareTo(node.getData()) < 0) {
            node.setLeft(create(node.getLeft(), value));
        } else {
            System.out.println("有相同的 pass");
        }

        return node;
    }

    /**
     * 前序遍历
     * @param node
     */
    public void prePrint(TreeNode<T> node) {
        if (null != node) {
            System.out.print(node.getData() + "->");
            prePrint(node.getLeft());
            prePrint(node.getRight());
        }
    }

    /**
     * 中序遍历
     * @param node
     */
    public void midPrint(TreeNode<T> node) {
        if (null != node) {
            midPrint(node.getLeft());
            System.out.print(node.getData() + "->");
            midPrint(node.getRight());
        }
    }

    /**
     * 后序遍历
     * @param node
     */
    public void postPrint(TreeNode<T> node) {
        if (null != node) {
            postPrint(node.getLeft());
            postPrint(node.getRight());
            System.out.print(node.getData() + "->");
        }
    }


    /**
     * 递归反转二叉树
     *
     * @param node
     */
    public void mirrorReverse(TreeNode node) {
        if (null == node) {
            return;
        }

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        mirrorReverse(node.left);
        mirrorReverse(node.right);

    }
    
    /**
     * 递归求解二叉树深度
     * @param root
     * @return
     */
    public int explore(TreeNode<T> root){
    	
    	if(null == root)
    		return 0;
    	
    	int leftDepth = explore(root.getLeft());
    	int rightDepth = explore(root.getRight());
    	
    	return leftDepth > rightDepth ? leftDepth + 1: rightDepth + 1;
    	
    }


}
