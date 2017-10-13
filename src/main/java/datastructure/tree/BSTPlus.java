package datastructure.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import com.google.common.collect.Lists;

/**
 * 完美二叉树
 * Created by Linuxea on 2017-09-30.
 */
public class BSTPlus<T extends Comparable<T>> {

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
        bstPlus.levelPrint(bstPlus.root);
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
        
        System.out.println("递归遍历二叉树深度:" + bstPlus.exploreDepth(bstPlus.root));
        
        System.out.println("非递归遍历二叉树深度: " + bstPlus.exploreDepthWithOutRecursive(bstPlus.root));
    }

    /**
     * 创建接口
     */
    @SuppressWarnings("unchecked")
	public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数!以 exit 为结束 ");
        String line;
        while (null != (line = scanner.nextLine()) && !line.equalsIgnoreCase("exit")) {
            root = create(root, (T) Integer.valueOf(line));
        }
        scanner.close();
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
     * 层次遍历
     * @param node
     */
    public void levelPrint(TreeNode<T> node){
    	
    	System.out.print("水平遍历开始");
    	
    	if(null == node)return;
    	
    	Queue<TreeNode<?>> queue = new LinkedList<>();
    	
    	queue.add(node);
    	
    	while(queue.isEmpty() == false){
    		TreeNode<?> temp = queue.poll();
    		System.out.print(temp.getData() + "->");
    		if(temp.left != null){
    			queue.add(temp.left);
    		}
    		
    		if(temp.right != null){
    			queue.add(temp.right);
    		}
    	}
    	
    	System.out.println();
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
    public void mirrorReverse(TreeNode<T> node) {
        if (null == node) {
            return;
        }

        TreeNode<T> temp = node.left;
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
    public int exploreDepth(TreeNode<T> root){
    	
    	if(null == root)
    		return 0;
    	
    	int leftDepth  = exploreDepth(root.getLeft());
    	int rightDepth = exploreDepth(root.getRight());
    	
    	return leftDepth > rightDepth ? leftDepth + 1: rightDepth + 1;
    	
    }
    
    /**
     * 非递归求解二叉树深度
     * 
     * 将节点划分为层次的思想
     * 
     * @param root
     * @return
     */
    public int exploreDepthWithOutRecursive(TreeNode<T> root){
    	
    	if( null ==  root ) return 0;
    	
    	List<TreeNode<T>> nodes = Lists.newArrayList();
    	nodes.add(root);
    	
    	int level = 0;
    	
    	while(nodes.isEmpty()  == false ){
    		
    		List<TreeNode<T>> nodesCopy = Lists.newArrayList(nodes);

    		nodes.clear();
    		
    		for(TreeNode<T> temp: nodesCopy){
    			if(temp.left != null){
    				nodes.add(temp.left);
    			}
    			if(temp.right != null){
    				nodes.add(temp.right);
    			}
    		}
    		
    		level++ ;
    		
    	}
    	
		return level;
    	
    }
    


}
