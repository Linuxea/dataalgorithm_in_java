package linkedlist;
/**
 * Created by Linuxea on 2017-08-21.
 */
public class LinkedList<T> {

    Node<T> head;

    public int add(T data){
        if(null == head){
            head = new Node<>(data);
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node<>(data); //why
        }
        return 1;
    }

    public void print(){
        if(null == head)return ;
        System.out.println(head.getData());
        while(head.next != null){
            System.out.println(head.next.getData());
            head = head.next;
        }
    }

}


class Node<T>{
    T data;
    Node next;

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(T data) {
        this.data = data;
    }

    public Node() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}



