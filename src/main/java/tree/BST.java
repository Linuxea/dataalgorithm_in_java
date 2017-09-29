package tree;

/**
 * 如果用递归的话每次创建时需要传递一个节点参数给它
 * 这个应该怎么解决呢
 * 可是递归好优美啊。。。。。
 * Created by Linuxea on 2017-09-29.
 */
public class BST<T extends Comparable> {


    public static void main(String[] args) {

        BST<Integer> bst = new BST<>();
        Node<Integer> root = null;
        Node<Integer> one = bst.create(root, 1);
        Node<Integer> two = bst.create(one, 2);
        Node<Integer> three = bst.create(two, 3);
        Node<Integer> four = bst.create(three, 4);
        Node<Integer> five = bst.create(four, 5);
        Node<Integer> six = bst.create(five, 6);
        Node<Integer> seven = bst.create(six, 7);
        bst.create(seven, 8);

        System.out.println("前序遍历开始");
        bst.prePrint(one);
        System.out.println("\n中序遍历开始");
        bst.midPrint(one);
        System.out.println("\n后序遍历开始");
        bst.postPrint(one);

        System.out.println("求深度");
        int depth = bst.exploreDepth(one);
        System.out.println("总共有深度" + depth);

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

    /**
     * 求二叉树深度
     *
     * @param root
     * @return
     */
    public int exploreDepth(Node<T> root) {
        if (root == null)
            return 0;
        int letDepth = exploreDepth(root.left);
        int rightDepth = exploreDepth(root.right);
        return letDepth > rightDepth ? letDepth + 1 : rightDepth + 1;
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







