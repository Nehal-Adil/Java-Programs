/*
                                Merge two Sorted Linked List
Problem statement
You have been given two sorted(in ascending order) singly linked lists of integers.

Write a function to merge them in such a way that the resulting singly linked list is also sorted(in ascending order) and return the new head to the list.

Note :
Try solving this in O(1) auxiliary space.

No need to print the list, it has already been taken care.
Detailed explanation ( Input/output format, Notes, Images )

Constraints :
1 <= t = 10^2
0 <= N <= 10 ^ 4
0 <= M <= 10 ^ 4
Where N and M denote the sizes of the singly linked lists.

Time Limit: 1sec
Sample Input 1 :
1
2 5 8 12 -1
3 6 9 -1
Sample Output 1 :
2 3 5 6 8 9 12

Sample Input 2 :
2
2 5 8 12 -1
3 6 9 -1
10 40 60 60 80 -1
10 20 30 40 50 60 90 100 -1
Sample Output 2 :
2 3 5 6 8 9 12
10 10 20 30 40 40 50 60 60 60 80 90 100

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

public class merge2sorted_LL {
    private static CN_Node<Integer> merge(CN_Node<Integer> head1, CN_Node<Integer> head2) {
        CN_Node<Integer> t1 = head1, t2 = head2;
        CN_Node<Integer> head = null, tail = null;

        // Base Case
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        // select the head
        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

        // traverse both the list
        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        // one list is over
        if (t1 != null) {
            //first list is remaining
            tail.next = t1;
        } else {
            tail.next = t2;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {
            CN_Node<Integer> head1 = CN_Node.takeInput();
            CN_Node<Integer> head2 = CN_Node.takeInput();

            CN_Node head = merge(head1, head2);
            CN_Node.print_LL(head);

            t -= 1;
            System.out.println();
        }
    }
}
