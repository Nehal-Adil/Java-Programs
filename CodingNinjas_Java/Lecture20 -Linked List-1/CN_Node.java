package CodingNinjas_DSA;

import java.util.Scanner;

public class CN_Node<T> {
    T data;
    CN_Node<T> next;

    // constructor
    CN_Node(T data){
        this.data = data;
        next = null;
    }

    // Take Input for Linked List
    static CN_Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);

        int data = sc.nextInt();
        CN_Node<Integer> head = null;
        CN_Node<Integer> tail = null;

        while (data != -1) {
            CN_Node<Integer> currentNode = new CN_Node<>(data);
            if (head == null) {
                // Make this head node and tail node
                head = currentNode;
                tail = currentNode;
            } else {
                // Now tail will refer to last Node
                tail.next = currentNode;
                // connect currentNode after last Node
                tail = currentNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    // print Linked List
    void print_LL(CN_Node<Integer> head){
        while (head != null) {
            System.out.print(head.data + " ");
            // reference of second node
            head = head.next;
        }
    }
}
