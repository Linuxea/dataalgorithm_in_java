package tree;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Linuxea on 2017-08-15.
 * 二叉树
 */
public class BinaryTree<T extends Comparable> {

	public BinaryTree() {
	}

	/**
	 * 放
	 * @param root
	 * @param t
	 */
	public Node put(Node<T> root, T t){
		if(null == root){ //根节点为空
			root = new Node<>(t);
		}else{
			if(root.getData().compareTo(t)>=0){
				root.setLeftNode(put(root.getLeftNode(), t));
			}else{
				root.setRightNode(put(root.getRightNode(), t));
			}
		}

		return root;
	}

	/**
	 * 从根结点开始
	 * @param root
	 */
	public void levelPrint(Node<T> root){
		Queue<Node<T>> nodeList = new LinkedList<>();
		nodeList.add(root);
		while (true){
			if(nodeList.isEmpty())break;
			Node<T> theFirst = nodeList.poll();
			if(null != theFirst){
				System.out.print(theFirst.getData() + " => ");
				nodeList.add(theFirst.getLeftNode());
				nodeList.add(theFirst.getRightNode());
			}
		}
	}

	/**
	 * 先序遍历
	 * @param root
	 */
	public void prePrint(Node<T> root){
		if(null == root)return;
		System.out.print(root.getData() + " => ");
		prePrint(root.getLeftNode());
		prePrint(root.getRightNode());
	}

	/**
	 * 中序遍历
	 * @param root
	 */
	public void middlePrint(Node<T> root){
		if(null == root)return;
		middlePrint(root.getLeftNode());
		System.out.print(root.getData() + " => ");
		middlePrint(root.getRightNode());
	}

	/**
	 * 后序遍历
	 * @param root
	 */
	public void afterPrint(Node<T> root){
		if(null == root)return;
		afterPrint(root.getLeftNode());
		afterPrint(root.getRightNode());
		System.out.print(root.getData() + " => ");
	}


	/**
	 * 树的节点
	 * @param <T>
	 */
	public static class Node<T>{
		Node<T> leftNode;
		Node<T> rightNode;
		T data;

		public Node(T data) {
			this.data = data;
		}

		public Node(Node<T> leftNode, Node<T> rightNode, T data) {
			this.leftNode = leftNode;
			this.rightNode = rightNode;
			this.data = data;
		}

		public Node<T> getLeftNode() {
			return leftNode;
		}

		public void setLeftNode(Node<T> leftNode) {
			this.leftNode = leftNode;
		}

		public Node<T> getRightNode() {
			return rightNode;
		}

		public void setRightNode(Node<T> rightNode) {
			this.rightNode = rightNode;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "Node{" +
					"leftNode=" + leftNode +
					", rightNode=" + rightNode +
					", data=" + data +
					'}';
		}
	}
}
