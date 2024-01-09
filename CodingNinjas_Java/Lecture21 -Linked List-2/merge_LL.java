/*
                            MergeSort Linked List
Problem statement
Given a singly linked list of integers, sort it using 'Merge Sort.'

Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Detailed explanation ( Input/output format, Notes, Images )

Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.

Time Limit: 1sec

Sample Input 1 :
1
10 9 8 7 6 5 4 3 -1
Sample Output 1 :
 3 4 5 6 7 8 9 10

Sample Input 2 :
2
-1
10 -5 9 90 5 67 1 89 -1
Sample Output 2 :
-5 1 5 9 10 67 89 90
}

 */
/*

    Following is the Node class already written for the Linked List

    class CN_Node<T> {
        T data;
        Node<T> next;

        public CN_Node(T data) {
            this.data = data;
        }
    }

*/

package CodingNinjas_DSA;

import java.util.Scanner;

public class merge_LL {
    private static CN_Node<Integer> mergeSort(CN_Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        CN_Node<Integer> middle = findMidPoint(head);
        CN_Node<Integer> head1 = head, head2 = middle.next;
        middle.next = null;

        head1 = mergeSort(head1);
        head2 = mergeSort(head2);
        head = merge(head1, head2);

        return head;
    }

    private static CN_Node<Integer> findMidPoint(CN_Node<Integer> head) {
        CN_Node<Integer> slow = head;
        CN_Node<Integer> fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

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
            CN_Node<Integer> head = CN_Node.takeInput();
            head = mergeSort(head);
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
            t -= 1;
            System.out.println();
        }
    }
}
