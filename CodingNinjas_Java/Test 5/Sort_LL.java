/*
Problem statement
Given a linked list of 'N' nodes, which has nodes in alternating non-decreasing and non-increasing. Sort the list in non-decreasing order.

For Example:

If given linked list is 1->9->3->8->4 then it should be modified to 1->3->4->8->9.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
7
1 9 2 8 3 7 4
Sample Output 1 :
1 2 3 4 7 8 9
Explanation to Sample Input 1 :
Since the given list is 1-> 9-> 2-> 8 -> 3 -> 7-> 4.
After sorting, it will be 1-> 2-> 3-> 4-> 7-> 8-> 9.

Sample Input 2 :
6
7 15 8 14 9 13
Sample Output 2 :
7 8 9 13 14 15
Explanation to Sample Input 1 :
Since the given list is 7-> 15-> 8-> 14 -> 9 -> 13.
After sorting, it will be 7-> 8-> 9-> 13-> 14-> 15.
Expected Space Complexity:
Try to solve this problem in O(1) space complexity.

Constraints :
1 <= N <= 10^3
0 <= data <= 10^3

Where 'N' is the length of the linked list.

Time Limit: 1 sec
 */

package Test5;

public class Sort_LL {

    class Node {
        public int data;
        public Node next;

        Node()
        {
            this.data = 0;
            this.next = null;
        }
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }

    public static Node midPoint(Node slow,Node fast){
        //Your code goes here
        if (slow==null) return null;
        if (fast.next == null || fast.next.next==null) return slow;
        return midPoint(slow.next,fast.next.next);
    }

    public static Node midPoint(Node head) {
        //Your code goes here
        return midPoint(head,head);
    }

    public static Node mergeTwoSortedLinkedLists(Node A, Node B) {
        //Your code goes here
        if(A == null) return B;
        if(B == null) return A;

        if(A.data < B.data)
        {
            A.next = mergeTwoSortedLinkedLists(A.next, B);
            return A;
        }
        else
        {
            B.next = mergeTwoSortedLinkedLists(A, B.next);
            return B;
        }
    }

    public static Node sortList(Node head) {
        //Your code goes here
        if (head==null || head.next == null) return head;
        Node midPoint = midPoint(head);
        Node part1 = sortList(midPoint.next);
        midPoint.next = null;
        Node part2 = sortList(head);
        return mergeTwoSortedLinkedLists(part1,part2);
    }
}
