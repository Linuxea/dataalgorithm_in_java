package datastructure.tree;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 前缀树
 * 多叉树结构
 * create by linuxea on 2017/9/4 12:18
 **/
public class MyTrie<T> {

    private Node<T> root;

    public void add(T t) {
        Node<T> temp = root;
        if (null == temp) {
            Node realRoot = new Node(t, null);
            root = realRoot;
            return;
        }

        //从 root 开始遍历
        List<T> list = root.getNext();
        if (list.contains(t)) {

        }

    }


    private static class Node<T> {
        boolean isWord = false; // default
        T t;
        List<T> next = Lists.newArrayList();

        public Node(T t, List<T> next) {
            this.t = t;
            this.next = next;
        }

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }

        public List<T> getNext() {
            return next;
        }

        public void setNext(List<T> next) {
            this.next = next;
        }
    }


}
