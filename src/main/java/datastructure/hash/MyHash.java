package datastructure.hash;

/**
 * 实现一个基于数组的简易hash表
 * create by linuxea on 2017/9/4 11:27
 **/
public class MyHash<K,V> {

    private Node<K,V>[] nodes = new Node[100];

    private int hash = 0; //default

    public int getHash(K k) {
        if(hash != 0) return hash;
        return hash = countHashCode(k);
    }

    /**
     * 添加节点
     * 暂不考虑hash冲突的拓展情况
     */
    public void add(K key, V value){
        int hash = countHashCode(key);
        Node<K,V> newNode = new Node(hash, key, value,null);
        nodes[hash] = newNode;
    }

    /**
     * 获取值
     * @param k
     * @return
     */
    public V get(K k){
        int hash = countHashCode(k);
        return nodes[hash].getValue();
    }

    /**
     * 根据key值来计算hashCode
     * @param k
     * @return
     */
    private int countHashCode(K k){
        if(hash != 0) return hash;
        int sum = 0;
        char[] chars = k.toString().toCharArray();
        for(char ch : chars){
            sum += (int)ch;
        }
        return hash = sum%100; // hashcode between 0 and 100
    }


    /**
     * 存储实体
     * @param <K>
     * @param <V>
     */
    private static class Node<K,V>{
        final int hash;
        final K key;
        V value;
        Node next; //此处不考虑链表拓展


        public Node(int hash, K key, V value, Node next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public int getHash() {
            return hash;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }



}
