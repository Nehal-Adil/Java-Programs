/*
Problem statement
Given a BST and an integer k. Find and return the path from the node with data k and root (if a node with data k is present in given BST) in a list. 
Return empty list otherwise.

Note: Assume that BST contains all unique elements.

Detailed explanation ( Input/output format, Notes, Images )
Input Format :
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space.
If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, 
it will not be a part of the data of any node.   
The following line of input contains an integer, that denotes the value of k.
Output Format :
The first line and only line of output prints the data of the nodes in the path from node k to root. The data of the nodes is separated by single space.

Constraints:
Time Limit: 1 second   

Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
2
Sample Output 1:
2 5 8


*/

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
