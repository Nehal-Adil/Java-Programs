/*
                                                    Next Number
Given a large number represented in the form of a linked list. Write code to increment the number by 1 in-place(i.e. without using extra space).

Note: You don't need to print the elements, just update the elements and return the head of updated LL. Input Constraints:
1 <= Length of Linked List <=10^6.
Detailed explanation ( Input/output format, Notes, Images )
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Output Format :
Line 1: Updated linked list elements
Sample Input 1 :
3 9 2 5 -1
Sample Output 1 :
3 9 2 6
Sample Input 2 :
9 9 9 -1
Sample Output 1 :
1 0 0 0
/***************
 * Following is the Node class already written
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 */

package Test5;

import java.util.Scanner;

public class NextNumber {

   static class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
        public LinkedListNode() {
            this.data = data;
        }
    }

    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> last = null;
        LinkedListNode<Integer> cur = head;

        // Iterate till the last node
        while (cur.next != null) {
            if (cur.data != 9) {
                last = cur;
            }
            cur = cur.next;
        }

        // If last node is not equal to 9
        // add 1 to it and return the head
        if (cur.data != 9) {
            cur.data++;
            return head;
        }

        // If list is of the type 9 . 9 . 9 ...
        if (last == null) {
            last = new LinkedListNode<>();
            last.next = head;
            head = last;
        }

        // For cases when the rightmost node which
        // is not equal to 9 is not the last
        // node in the linked list
        last.data++;
        last = last.next;

        while (last != null) {
            last.data = 0;
            last = last.next;
        }
        return head;
    }

    static Scanner s = new Scanner(System.in);

    public static LinkedListNode<Integer> takeInput() {
        LinkedListNode<Integer> head = null, tail = null;
        int data = s.nextInt();
        while(data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(LinkedListNode<Integer> head){
        while(head != null){
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedListNode<Integer> head = takeInput();
        head = nextLargeNumber(head);
        print(head);

    }
}
