package BinaryTree;

import java.util.Scanner;

public class BinaryTreeUse {

    // Number of Nodes
    static int numNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftCount = numNodes(root.left);
        int rigthCount = numNodes(root.right);

        return 1 + leftCount + rigthCount;
    }

    // Largest Node
    static int largest(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }
        int leftLargest = largest(root.left);
        int rightLargest = largest(root.right);

        return Math.max(root.data, Math.max(leftLargest, rightLargest));
    }

    // Number of Leaf Nodes
    static int leafNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return leafNodes(root.left) + leafNodes(root.right);
    }

    // Remove Leaf Nodes
    static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
        if (root == null) return null;

        if (root.left == null && root.right == null) {
            return null;
        }
        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);

        return root;
    }

    // Print At Depth K
    static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data);
            return;
        }
        printAtDepthK(root.left, k - 1);
        printAtDepthK(root.right, k - 1);
    }

    // Height of a Tree
    static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);

    }

    // Tree is Balanced or not
    static boolean isBalanced(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        return isLeftBalanced && isRightBalanced;
    }

    // Take Input from the User
    static BinaryTreeNode<Integer> takeTreeInput() {

        System.out.println("Enter root data");

        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInput();
        BinaryTreeNode<Integer> rightChild = takeTreeInput();

        root.left = leftChild;
        root.right = rightChild;

        return root;

    }

    // Take Tree Input from the User
    static BinaryTreeNode<Integer> takeTreeInput_Better(boolean isRoot, int parentData, boolean isLeft) {
        Scanner sc = new Scanner(System.in);

        if (isRoot) {
            System.out.print("Enter root data: ");

        } else {
            if (isLeft) {
                System.out.print("Enter left child of " + parentData + ": ");
            } else {
                System.out.print("Enter Right child of " + parentData + ": ");
            }
        }

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

    // Print the Tree
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

        System.out.println("Number of Nodes: " + numNodes(root));
        System.out.println("Largest Node: " + largest(root));
        System.out.println("Number of Leaf Nodes: " + leafNodes(root));
        System.out.println("Print At Depth K: ");
        printAtDepthK(root, 2);
        System.out.println("Is Tree Balanced: " + isBalanced(root));
        System.out.println("Remove Leaf Nodes");
        BinaryTreeNode<Integer> newRoot = removeLeaves(root);
        printTreeDetailed(newRoot);

    }
}
