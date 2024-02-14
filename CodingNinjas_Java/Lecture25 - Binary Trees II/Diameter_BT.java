/*
For a given Binary of type integer, find and return the ‘Diameter’. The diameter of a tree can be defined as the maximum distance between two leaf nodes.
Here, the distance is measured in terms of the total number of nodes present along the path of the two leaf nodes, including both the leaves.

Input Format:
The first and the only line of input will contain the node data, all separated by a single space.
Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.

Output Format:
The only line of output prints an integer, representing the diameter of the tree.
Note: You are not required to print anything explicitly. It has already been taken care of.

Constraints:
1 <= N <= 10^5
Where N is the total number of nodes in the binary tree.
Time Limit: 1 sec

Sample Input 1:
2 4 5 6 -1 -1 7 20 30 80 90 -1 -1 8 -1 -1 9 -1 -1 -1 -1 -1 -1
Sample Output 1:
9

Sample Input 2:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 2:
5
*/
/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

package BinaryTree;

public class Diameter_BT {
    static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int diam1 = diameterOfBinaryTree(root.left);
        int diam2 = diameterOfBinaryTree(root.right);
        int diam3 = findHeight(root.left) + findHeight(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));

        // return findHeight(root.left)+findHeight(root.right)+1;
        // if the first return statement doesn't work use another one
    }

    public static int findHeight(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInput_Better(true, 0, true);
        BinaryTreeUse.printTreeDetailed(root);
        System.out.println("Diameter of the Binary Tree: " + diameterOfBinaryTree(root));
    }
}
