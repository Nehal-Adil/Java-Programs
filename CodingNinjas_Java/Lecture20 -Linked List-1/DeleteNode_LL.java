/*
                                            Delete Node in LL
You have been given a linked list of integers. Your task is to write a function that deletes a node from a given position, 'pos'.
Note : Assume that the Indexing for the linked list always starts from 0.
If the position is greater than or equal to the length of the linked list, you should return the same linked list without any change.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
The first line of each test case or query contains the elements of the linked list separated by a single space.
The second line of each test case contains the integer value of 'pos'. It denotes the position in the linked list from where the node has to be deleted.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element

Output format :
For each test case/query, print the resulting linked list of integers in a row, separated by a single space.
Output for every test case will be printed in a separate line.
You don't need to print explicitly, it has been taken care of.

Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
pos >= 0
Time Limit: 1sec
Where 'N' is the size of the singly linked list.

Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3
Sample Output 1 :
3 4 5 6 1 9

Sample Input 2 :
2
3 4 5 2 6 1 9 -1
0
10 20 30 40 50 60 -1
7
Sample Output 2 :
4 5 2 6 1 9
10 20 30 40 50 60

*/

/*

 Following is the Node class already written for the Linked List

 class  CN_Node<T> {
    T data;
    CN_Node<T> next;

    public  CN_Node(T data) {
        this.data = data;
    }
 }

 */

package CodingNinjas_DSA;

import LinkedList.Node;

import java.util.Scanner;

public class DeleteNode_LL {

    static CN_Node<Integer> delete(CN_Node<Integer> head, int pos) {
        if (pos < 0) {
            return head;
        } else if (pos == 0) {
            head = head.next;
        } else {
            CN_Node<Integer> current = head;

            for (int i = 0; i < pos - 1 && current != null; i++) {
                current = current.next;
            }

            if (current != null) {
                if (current.next != null) {
                    current.next = current.next.next;
                } else {
                    current.next = null;
                }
            }
        }
        return head;
    }

    //    static CN_Node<Integer> delete(CN_Node<Integer> head, int pos) {
//
//        if (head == null) {
//            return null;
//        }
//        if (pos == 0) {
//            return head.next;
//        }
//
//        int count = 0;
//        CN_Node<Integer> temp = head, prev = head;
//
//        while (temp != null) {
//            if (count == pos) {
//                prev.next = temp.next;
//                break;
//            } else {
//                prev = temp;
//                temp = temp.next;
//                count++;
//            }
//        }
//        return head;
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CN_Node<Integer> head = CN_Node.takeInput();
        int pos = sc.nextInt();
        head = delete(head, pos);
        CN_Node.print_LL(head);

    }
}
