package CodingNinjas_DSA;

import java.util.Scanner;

public class CodingNinjasNode<T> {
    T data;
    CodingNinjasNode<T> next;

    // constructor
    CodingNinjasNode(T data){
        this.data = data;
        next = null;
    }

    // Take Input for Linked List
    static CodingNinjasNode<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);

        int data = sc.nextInt();
        CodingNinjasNode<Integer> head = null;
        CodingNinjasNode<Integer> tail = null;

        while (data != -1) {
            CodingNinjasNode<Integer> currentNode = new CodingNinjasNode<>(data);
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
    void print_LL(CodingNinjasNode<Integer> head){
        while (head != null) {
            System.out.print(head.data + " ");
            // reference of second node
            head = head.next;
        }
    }
}
