/*
Problem statement
Given a BST, convert it into a sorted linked list. You have to return the head of LL.

Detailed explanation ( Input/output format, Notes, Images )
Input format:
The first and only line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space.
If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore,
it will not be a part of the data of any node.
Output Format:
The first and only line of output prints the elements of sorted linked list.

Constraints:
Time Limit: 1 second
1<=n<=10^5
Note:
In case if you are facing any issue to solve this problem, please prefer to use the helper function.

Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
Sample Output 1:
2 5 6 7 8 10

 */

package CodingNinjas_DSA;

import java.util.ArrayList;
import java.util.Collections;

import static CodingNinjas_DSA.LevelOrderTraversal.takeInput;

public class Convert_BST_LL {

    private static class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        LinkedListNode(T data) {
            this.data = data;
        }
    }

    static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return null;
        }
        LinkedListNode<Integer> head = new LinkedListNode<>(root.data);
        helper(root, head);

        return head.next;
    }

    static LinkedListNode<Integer> addNode(BinaryTreeNode<Integer> currBSTNode, LinkedListNode<Integer> currLLNode) {
        LinkedListNode<Integer> newNode = new LinkedListNode<>(currBSTNode.data);
        currLLNode.next = newNode;

        return newNode;
    }

    static LinkedListNode<Integer> helper(BinaryTreeNode<Integer> currBSTNode, LinkedListNode<Integer> currLLNode) {
        if (currBSTNode == null) {
            return currLLNode;
        }
        if (currBSTNode.left != null) {
            currLLNode = helper(currBSTNode.left, currLLNode);
        }
        currLLNode = addNode(currBSTNode, currLLNode);

        if (currBSTNode.right != null) {
            currLLNode = helper(currBSTNode.right, currLLNode);
        }
        return currLLNode;
    }

    // With the help of Array List
    static LinkedListNode<Integer> constructLinkedList2(BinaryTreeNode<Integer> root) {
        ArrayList<Integer> list = new ArrayList<>();

        helper2(root, list);

        Collections.sort(list);

        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        int i = 0;
        while (i < list.size()) {
            LinkedListNode<Integer> cn = new LinkedListNode<Integer>(list.get(i));

            if (head == null) {
                head = cn;
                tail = cn;
            } else {
                tail.next = cn;
                tail = tail.next;
            }
            i++;
        }
        return head;
    }

    public static void helper2(BinaryTreeNode<Integer> root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        list.add(root.data);
        helper2(root.left, list);
        helper2(root.right, list);

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput();
        LinkedListNode<Integer> head = constructLinkedList(root);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
