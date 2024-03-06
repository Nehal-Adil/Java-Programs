/*
Problem statement
Implement the BST class which includes following functions -

1. insert -
Given an element, insert that element in the BST at the correct position. If element is equal to the data of the node, insert it in the left subtree.

2. search
Given an element, find if that is present in BST or not. Return true or false.

3. delete -
Given an element, remove that element from the BST. If the element which is to be deleted has both children, replace that with the minimum element from right sub-tree.

4. printTree (recursive) -
Print the BST in the following format -

For printing a node with data N, you need to follow the exact format -
N:L:x,R:y
where, N is data of any node present in the binary tree. x and y are the values of left and right child of node N.
Print the children only if it is not null.
There is no space in between.
You need to print all nodes in the recursive format in different lines.

 */

package CodingNinjas_DSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinarySearchTree {
    private BinaryTreeNode<Integer> root;
    private int size;

    public void insert(int data) {
        //Implement the insert() function
        root = insertHelper(root, data);
        size++;
    }

    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int x) {
        if (root == null) {
            BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<Integer>(x);
            return newRoot;
        }

        if (x > root.data) {
            root.right = insertHelper(root.right, x);
        } else {
            root.left = insertHelper(root.left, x);
        }
        return root;
    }

    public void remove(int data) {
        //Implement the remove() function
        BST_DeleteReturn output = deleteDataHelper(root, data);
        root = output.root;
        if (output.deleted) {
            size--;
        }
        //return output.deleted;
    }

    private static BST_DeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root, int x) {
        if (root == null) return new BST_DeleteReturn(null, false);

        if (root.data < x) {
            BST_DeleteReturn outputRight = deleteDataHelper(root.right, x);
            root.right = outputRight.root;
            outputRight.root = root;
            return outputRight;
        }

        if (root.data > x) {
            BST_DeleteReturn outputLeft = deleteDataHelper(root.left, x);
            root.left = outputLeft.root;
            outputLeft.root = root;
            return outputLeft;
        }

        //Now, we handle the three sub-cases where root.data=x
        //Handling case where root has no children
        if (root.left == null && root.right == null) return new BST_DeleteReturn(null, true);

        //Handling case where only left child is present
        if (root.left != null && root.right == null) return new BST_DeleteReturn(root.left, true);

        //Handling case where only right child is present
        if (root.right != null && root.left == null) return new BST_DeleteReturn(root.right, true);

        //Both children are present
        //Get the smallest node's data from right subtree
        int rightSmallest = minimum(root.right);

        //Replace current root's data with smallest node's data
        root.data = rightSmallest;

        //Now, delete the node with the smallest value from the right subtree
        BST_DeleteReturn outputRight = deleteDataHelper(root.right, rightSmallest);

        //Update the current root's right child, after removing the node with the smallest value
        root.right = outputRight.root;

        return new BST_DeleteReturn(root, true);
    }

    //Find the smallest data value in the binary tree
    private static int minimum(BinaryTreeNode<Integer> root) {
        if (root == null) return Integer.MAX_VALUE;

        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);

        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    public void printTree() {
        //Implement the printTree() function
        printTreeDetailed(root);
    }

    private static void printTreeDetailed(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + ":");
        if (root.left != null) {
            System.out.print("L:" + root.left.data + ",");
        }
        if (root.right != null) {
            System.out.print("R:" + root.right.data);
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }

    // Search function - O(H)
    public boolean search(int data) {
        //Implement the search() function
        return isPresentHelper(root, data);
    }

    private static boolean isPresentHelper(BinaryTreeNode<Integer> root, int x) {
        if (root == null) return false;

        if (root.data == x) return true;

        if (x < root.data) {
            return isPresentHelper(root.left, x);
        } else {
            return isPresentHelper(root.right, x);
        }
    }

}

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BinarySearchTree bst = new BinarySearchTree();
        int choice, input;
        int q = Integer.parseInt(br.readLine());
        while (q-- > 0) {
            st = new StringTokenizer(br.readLine());
            choice = Integer.parseInt(st.nextToken());
            switch (choice) {
                case 1:
                    input = Integer.parseInt(st.nextToken());
                    bst.insert(input);
                    break;
                case 2:
                    input = Integer.parseInt(st.nextToken());
                    bst.remove(input);
                    break;
                case 3:
                    input = Integer.parseInt(st.nextToken());
                    System.out.println(bst.search(input));
                    break;
                default:
                    bst.printTree();
                    break;
            }

        }
    }
}