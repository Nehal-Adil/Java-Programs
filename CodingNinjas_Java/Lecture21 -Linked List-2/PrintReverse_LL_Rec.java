/*
                                Reverse LL(Recursive)
Problem statement
Given a singly linked list of integers, reverse it using recursion and return the head to the modified list.
You have to do this in O(N) time complexity where N is the size of the linked list.

 Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Detailed explanation ( Input/output format, Notes, Images )

Sample Input 1 :
1
1 2 3 4 5 6 7 8 -1
Sample Output 1 :
8 7 6 5 4 3 2 1

Sample Input 2 :
2
10 -1
10 20 30 40 50 -1
Sample Output 2 :
10
50 40 30 20 10

*/

/*

    Following is the Node class already written for the Linked List

    class CN_Node<T> {
        T data;
        CN_Node<T> next;

        public CN_Node(T data) {
            this.data = data;

 */

package CodingNinjas_DSA;

import java.util.Scanner;

class DoubleNode {
    CN_Node<Integer> head;
    CN_Node<Integer> tail;

    //constructor
    DoubleNode(CN_Node<Integer> head, CN_Node<Integer> tail) {
        this.head = head;
        this.tail = tail;
    }

    DoubleNode() {

    }
}

public class PrintReverse_LL_Rec {

    // This solution is better than reverseRec_Better, and it has O(n) complexity
    static CN_Node<Integer> reverseRec_Best(CN_Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        CN_Node<Integer> smallHead = reverseRec_Best(head.next);
        CN_Node<Integer> reversedTail = head.next;

        reversedTail.next = head;
        head.next = null;

        return smallHead;
    }

    // This solution is better than reverseRec, and it has O(n) complexity
    static DoubleNode reverseRec_Better(CN_Node<Integer> head) {
        DoubleNode ans;
        if (head == null || head.next == null) {
            ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }

        // This double node will have both head and tail of reversed linked list
        DoubleNode smallAns = reverseRec_Better(head.next);
        smallAns.tail.next = head;
        head.next = null;

        ans = new DoubleNode();
        ans.head = smallAns.head;
        ans.tail = head;

        return ans;
    }

    // This solution has O(n^2)
    private static CN_Node<Integer> reverseRec(CN_Node<Integer> head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        } else {
            CN_Node<Integer> newHead = reverseRec(head.next);
            CN_Node<Integer> temp = newHead;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = head;
            head.next = null;
            return newHead;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {

            CN_Node<Integer> head = CN_Node.takeInput();

            // Method 1
//            head = reverseRec(head);
//            CN_Node.print_LL(head);

            // Method 2
//            DoubleNode ans = reverseRec_Better(head);
//            CN_Node.print_LL(ans.head);

            // Method 3
            head = reverseRec_Best(head);
            CN_Node.print_LL(head);

            t -= 1;
            System.out.println();
        }
    }
}
