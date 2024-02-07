/*
                                            Bubble Sort
Given a singly linked list of integers, sort it using 'Bubble Sort.' Note : No need to print the list, it has already been taken care. Only return the new head to the list.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element

Output format :
For each test case/query, print the elements of the sorted singly linked list.
Output for every test case will be printed in a seperate line.

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
*/
/*

	Following is the Node class already written for the Linked List

	class CN_Node<T> {
    	T data;
    	CN_Node<T> next;

    	public CN_Node(T data) {
        	this.data = data;
    	}
	}

*/

package CodingNinjas_DSA;

import LinkedList.Node;

public class BubbleSort_LL {
    static int length(Node<Integer> head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    static Node<Integer> bubbleSort(Node<Integer> head) {
        Node<Integer> originalHead = head;
        int n = length(head);

        for (int i = 0; i < n - 1; i++) {

            Node<Integer> prev = null, curr = originalHead;

            for (int j = 0; j < n - i - 1; j++) {            // while(curr.next!=null)

                if (curr.data <= curr.next.data) {
                    prev = curr;
                    curr = curr.next;

                } else {

                    if (prev == null) {
                        Node<Integer> curr2 = curr.next;
                        Node<Integer> temp = curr2.next;
                        curr2.next = curr;
                        curr.next = temp;
                        prev = curr2;
                        originalHead = curr2;
                    } else {
                        Node<Integer> curr2 = curr.next;
                        Node<Integer> temp = curr2.next;
                        prev.next = curr2;
                        curr2.next = curr;
                        curr.next = temp;
                        prev = curr2;
                    }
                }
            }
        }
        return originalHead;
    }

    public static void main(String[] args) {
        Node<Integer> head = Node.takeInput();

        head = bubbleSort(head);
        Node.print(head);
    }
}
