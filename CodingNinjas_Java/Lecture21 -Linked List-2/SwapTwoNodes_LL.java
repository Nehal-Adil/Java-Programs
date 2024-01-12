/*
                                            Swap Two Nodes of Linked List
You have been given a singly linked list of integers along with two integers, 'i,' and 'j.' Swap the nodes that are present at the 'i-th' and 'j-th' positions.
Note : Remember, the nodes themselves must be swapped and not the datas.
No need to print the list, it has already been taken care. Only return the new head to the list.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
The first line of each test case or query contains the elements of the singly linked list separated by a single space.
The second line of input contains two integer values 'i,' and 'j,' respectively. A single space will separate them.
Remember/consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element

Output format :
For each test case/query, print the elements of the updated singly linked list.
Output for every test case will be printed in a separate line.

Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.
0 <= i < M
0 <= j < M
Time Limit: 1sec

Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3 4
Sample Output 1 :
3 4 5 6 2 1 9

Sample Input 2 :
2
10 20 30 40 -1
1 2
70 80 90 25 65 85 90 -1
0 6
Sample Output 2 :
10 30 20 40
90 80 90 25 65 85 70
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

import java.util.Scanner;

public class SwapTwoNodes_LL {
//    static CN_Node<Integer> swapNodes(CN_Node<Integer> head, int I, int J) {
//
//        CN_Node<Integer> prev1 =null, prev2=null, curr1=head, curr2 =head;
//
//        if (I==0 || J==0) {
//            prev2.next=curr1;
//
//        }
//        else if ((Math.abs(I-J)) == 1){
//            // TODO
//        }
//        else if (I==0 || J==0 && (Math.abs(I-J)) == 1){
//            // TODO
//        }
//        else {
//
//            for (int i=1; i<=I; i++) {
//                prev1=curr1;
//                curr1=curr1.next;
//            }
//            for (int j=1; j<=J; j++) {
//                prev2=curr2;
//                curr2=curr2.next;
//            }
//
//            prev1.next=curr2;
//            prev2.next=curr1;
//            curr1.next=curr2.next;
//            curr2.next=prev2;
//        }
//        return head;
//    }

    private static CN_Node<Integer> swap_nodes(CN_Node<Integer> head, int I, int J) {
        CN_Node<Integer> prev1 = null, prev2 = null;
        CN_Node<Integer> curr1 = head, curr2 = head;

        for (int i = 1; i <= I; i++) {
            prev1 = curr1;
            curr1 = curr1.next;
        }
        for (int i = 1; i <= J; i++) {
            prev2 = curr2;
            curr2 = curr2.next;
        }
        if (prev1 == null) {
            head = curr2;
        } else {
            prev1.next = curr2;
        }

        CN_Node<Integer> temp = curr2.next;
        if (prev2 != curr1)
            curr2.next = curr1.next;
        else
            curr2.next = curr1;
        if (prev2 == null) {
            head = curr1;
        } else {
            prev2.next = curr1;
        }
        curr1.next = temp;
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            CN_Node<Integer> head = CN_Node.takeInput();
            int I = sc.nextInt();
            int J = sc.nextInt();

            head = swap_nodes(head, I, J);

            CN_Node.print_LL(head);

            t -= 1;
            System.out.println();
        }
    }
}
