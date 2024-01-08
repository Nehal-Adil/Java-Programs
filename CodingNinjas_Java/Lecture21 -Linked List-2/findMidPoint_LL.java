/*
                                            Mid-Point Linked List
Problem statement
For a given singly linked list of integers, find and return the node present at the middle of the list.

Note :
If the length of the singly linked list is even, then return the first middle node.

Example: Consider, 10 -> 20 -> 30 -> 40 is the given list, then the nodes present at the middle with respective data
values are, 20 and 30. We return the first node with data 20.
Detailed explanation ( Input/output format, Notes, Images )

Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.

Time Limit: 1sec

Sample Input 1 :
1
1 2 3 4 5 -1
Sample Output 1 :
3

Sample Input 2 :
2
-1
1 2 3 4 -1
Sample Output 2 :
2
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

public class findMidPoint_LL {
    private static CN_Node<Integer> midPoint(CN_Node<Integer> head) {
        CN_Node<Integer> slow = head;
        CN_Node<Integer> fast = head;

        if (head == null) {
            return head;
        }

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            CN_Node<Integer> head = CN_Node.takeInput();
            CN_Node<Integer> mid = midPoint(head);

            if (mid != null) {
                System.out.println(mid.data);
            }

            t -= 1;
        }
    }
}
