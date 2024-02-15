/*
                                                          Move To Last
Given a linked list and a key in it, the task is to move all occurrences of given key to end of linked list, keeping order of all other elements same.

Return the updated head of LL.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= size of list <= 100

Sample Input 1:
1 2 2 3 4 5 -1
2
Sample Output 1:
1 3 4 5 2 2

Sample Input 2:
1 1 2 3 4 -1
1
Sample Output 2:
2 3 4 1 1

 */

package Test6;

import java.util.Scanner;

public class MoveToLast {

    static class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public static Node<Integer> moveToLast(Node<Integer> head, int key) {

        Node<Integer> prev = head;
        Node<Integer> curr = head;

        while (curr != null) {

            if (curr != prev && curr.data != key) {
                prev.data = curr.data;
                curr.data = key;
                prev = prev.next;
            }

            if (prev.data != key) {
                prev = prev.next;
            }

            curr = curr.next;
        }

        return head;
    }

    static Scanner s = new Scanner(System.in);

    public static Node<Integer> createList() {
        Node<Integer> head = null;
        Node<Integer> rear = null;
        int data = s.nextInt();
        while (data != -1) {
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {
                head = newNode;
                rear = head;
            } else {
                rear.next = newNode;
                rear = rear.next;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head1 = createList();
        int n = s.nextInt();
        print(moveToLast(head1, n));
    }
}
