package BinaryTree;

import java.util.ArrayList;

public class NodeToRootPath {
    static ArrayList<Integer> nodeToRoot(BinaryTreeNode<Integer> root, int x) {
        if (root == null) {
            return null;
        }
        if (root.data == x) {
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }

        ArrayList<Integer> leftOutput = nodeToRoot(root.left, x);
        if (leftOutput != null) {
            leftOutput.add(root.data);
            return leftOutput;
        }

        ArrayList<Integer> rightOutput = nodeToRoot(root.right, x);
        if (rightOutput != null) {
            rightOutput.add(root.data);
            return rightOutput;
        }
        return null;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputLevelWise();
        ArrayList<Integer> path = nodeToRoot(root, 5);
        if (path == null) {
            System.out.println("Not Found");
        } else {
            for (int i : path) {
                System.out.print(i + " ");
            }
        }
    }
}
