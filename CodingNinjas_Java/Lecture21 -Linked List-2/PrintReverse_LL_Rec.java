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

public class PrintReverse_LL_Rec {
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
            head = reverseRec(head);
            CN_Node.print_LL(head);
            t -= 1;
            System.out.println();
        }
    }
}
