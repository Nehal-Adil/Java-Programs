/*
                                        Even After Odd Linked List
Problem statement
For a given singly linked list of integers, arrange the nodes such that all the even number nodes are placed after the all
odd number nodes. The relative order of the odd and even terms should remain unchanged.

Note :
1. No need to print the linked list, it has already been taken care. Only return the new head to the list.
2. Don't create a new linked list.
3.  Just change the data, instead rearrange the provided list.
Detailed explanation ( Input/output format, Notes, Images )

Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.

Time Limit: 1sec

Sample Input 1 :
1
1 4 5 2 -1
Sample Output 1 :
1 5 4 2

Sample Input 2 :
2
1 11 3 6 8 0 9 -1
10 20 30 40 -1
Sample Output 2 :
1 11 3 9 6 8 0
10 20 30 40
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

public class EvenAfterOdd_LL {
    private static CN_Node<Integer> evenAfterOdd(CN_Node<Integer> head) {
        CN_Node<Integer> oddHead = null, oddTail = null, evenHead = null, evenTail = null;

        while (head != null) {
            if (head.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = head;
                    evenTail = head;
                } else {
                    evenTail.next = head;
                    evenTail = head;
                }
            } else {
                if (oddHead == null) {
                    oddHead = head;
                    oddTail = head;
                } else {
                    oddTail.next = head;
                    oddTail = head;
                }
            }
            head = head.next;
        }
        if (oddHead == null) {
            return evenHead;
        }
        if (evenHead == null) {
            return oddHead;
        }
        oddTail.next = evenHead;
        evenTail.next = null;

        return oddHead;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            CN_Node<Integer> head = CN_Node.takeInput();
            head = evenAfterOdd(head);
            CN_Node.print_LL(head);

            t -= 1;
            System.out.println();
        }
    }
}
