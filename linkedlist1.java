import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class linkedlist{
    public static void main(String args[]){
        Node head  = new Node(5);
        Node Second =new Node(3);
        Node third  = new Node(9);
        Node fourth = new Node(8);
        Node Fifth = new Node(16);
        head.next = Second;
        Second.next = third;
        third.next = fourth;
        fourth.next = Fifth;
        Node current = head;
        while(current.next != null){
            System.out.print(current.data+" ");
            current = current.next;
        }


    }
}
