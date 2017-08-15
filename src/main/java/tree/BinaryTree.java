package tree;

import com.google.common.collect.Lists;

import java.util.List;

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
	 *
	 * @param root
	 */
	public void print(Node<T> root){
		List<Node<T>> nodeList = Lists.newArrayList();
		
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
