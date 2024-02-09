package CodingNinjas_DSA;

import java.util.Scanner;

public class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<Integer> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // Take Input
    static BinaryTreeNode<Integer> takeTreeInput_Better(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.print("Enter root data: ");

        } else {
            if (isLeft) {
                System.out.print("Enter left child of " + parentData + ": ");
            } else {
                System.out.print("Enter Right child of " + parentData + ": ");
            }
        }

        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInput_Better(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeTreeInput_Better(false, rootData, false);

        root.left = leftChild;
        root.right = rightChild;

        return root;

    }

    //Print the Tree
    static void printTree(BinaryTreeNode<Integer> root) {

        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);

    }

    // Print Tree Detailed
    static void printTreeDetailed(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + ":");
        if (root.left != null) {
            System.out.print("L" + root.left.data + ", ");
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();

        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeTreeInput_Better(true, 0, true);
        printTreeDetailed(root);
    }

}
