package tree;

/**
 * Created by Linuxea on 2017-08-15.
 * 二叉树
 */
public class BinaryTree<T extends Comparable> {

    private BinaryTree leftTree;
    private BinaryTree rightTree;
    private T data;

    /**
     * 存储
     * 返回根结点
     * @param t
     */
    public BinaryTree put(BinaryTree root,T t){
        if(null == root){
            root = new BinaryTree(leftTree, rightTree, t);
        }else{
            if(root.getData().compareTo(t)>0){
                root.setLeftTree(new BinaryTree());
                put(root.getLeftTree(), t);
            }else if(root.getData().compareTo(t) == 0){
               //pass
            }else{
                root.setRightTree(new BinaryTree());
                put(root.getRightTree(), t);
            }
        }

        return root;
    }




    public BinaryTree getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(BinaryTree leftTree) {
        this.leftTree = leftTree;
    }

    public BinaryTree getRightTree() {
        return rightTree;
    }

    public void setRightTree(BinaryTree rightTree) {
        this.rightTree = rightTree;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTree(T data) {
        this.data = data;
    }


    public BinaryTree() {
    }

    public BinaryTree(BinaryTree leftTree, BinaryTree rightTree, T data) {
        this.leftTree = leftTree;
        this.rightTree = rightTree;
        this.data = data;
    }



    @Override
    public String toString() {
        return "BinaryTree{" +
                "leftTree=" + leftTree +
                ", rightTree=" + rightTree +
                ", data=" + data +
                '}';
    }
}