package tree;

/**
 * Created by Linuxea on 2017-09-29.
 */
public class BST<T extends Comparable> {


    public static void main(String[] args) {

        BST<Integer> bst = new BST<>();
        Node<Integer> root = null;
        Node<Integer> one = bst.create(root, 1);
        Node<Integer> two = bst.create(one, 2);
        Node<Integer> three = bst.create(two, 4);
        Node<Integer> four = bst.create(three, -8);
        Node<Integer> five = bst.create(four, -9);
        Node<Integer> six = bst.create(five, -7);

        System.out.println("前序遍历开始");
        bst.prePrint(one);
        System.out.println("\n中序遍历开始");
        bst.midPrint(one);
        System.out.println("\n后序遍历开始");
        bst.postPrint(one);

    }

    public Node<T> create(Node<T> node, T value) {
        if (null == node) {
            node = new Node<>(value);
            node.setData(value);
        } else {
            if (node.getData().compareTo(value) > 0) {
                node.setLeft(create(node.left, value));
            } else if (node.getData().compareTo(value) < 0) {
                node.setRight(create(node.right, value));
            }
        }

        return node;
    }

    public void prePrint(Node<T> node) {
        if (null != node) {
            System.out.print(node.getData() + "->");
            prePrint(node.getLeft());
            prePrint(node.getRight());
        }
    }

    public void midPrint(Node<T> node) {
        if (null != node) {
            midPrint(node.getLeft());
            System.out.print(node.getData() + "->");
            midPrint(node.getRight());
        }
    }

    public void postPrint(Node<T> node) {
        if (null != node) {
            postPrint(node.getLeft());
            postPrint(node.getRight());
            System.out.print(node.getData() + "->");
        }
    }

}


class Node<T extends Comparable> {
    T data;
    Node<T> left;
    Node<T> right;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}







