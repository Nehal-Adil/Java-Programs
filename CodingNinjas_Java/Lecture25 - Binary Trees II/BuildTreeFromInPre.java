/*
Problem statement
For a given preorder and inorder traversal of a Binary Tree of type integer stored in an array/list, create the binary tree using the given two arrays/lists.
You just need to construct the tree and return the root.

Note:
Assume that the Binary Tree contains only unique elements.

Detailed explanation ( Input/output format, Notes, Images )
Input Format:
The first line of input contains an integer N denoting the size of the list/array. It can also be said that N is the total number of nodes the binary tree would have.

The second line of input contains N integers, all separated by a single space. It represents the preorder-traversal of the binary tree.

The third line of input contains N integers, all separated by a single space. It represents the inorder-traversal of the binary tree.
Output Format:
The given input tree will be printed in a level order fashion where each level will be printed on a new line.
Elements on every level will be printed in a linear fashion. A single space will separate them.

Constraints:
1 <= N <= 10^3
Where N is the total number of nodes in the binary tree.
Time Limit: 1 sec

Sample Input 1:
7
1 2 4 5 3 6 7
4 2 5 1 6 3 7
Sample Output 1:
1
2 3
4 5 6 7

Sample Input 2:
6
5 6 2 3 9 10
2 6 3 9 5 10
Sample Output 2:
5
6 10
2 3
9

 */

package CodingNinjas_DSA;

public class BuildTreeFromInPre {

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {

        BinaryTreeNode<Integer> root = buildTree(preOrder, inOrder, 0, preOrder.length - 1, 0, inOrder.length - 1);
        return root;
    }

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder, int siPre, int eiPre, int siIn, int eiIn) {
        if (siPre > eiPre) {
            return null;
        }

        int rootData = preOrder[siPre];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);

        int rootIndex = -1;
        for (int i = siIn; i <= eiIn; i++) {
            if (inOrder[i] == rootData) {
                rootIndex = i;
                break;
            }
        }

        //Defining index limits for Left Subtree Inorder
        int siInLeft = siIn;
        int eiInLeft = rootIndex - 1;

        //Defining the index limits for Left Subtree Preorder
        int siPreLeft = siPre + 1;
        int leftSubTreeLength = eiInLeft - siInLeft + 1;
        int eiPreLeft = (siPreLeft) + (leftSubTreeLength - 1);

        //Defining index limits for Right Subtree Inorder
        int siInRight = rootIndex + 1;
        int eiInRight = eiIn;

        //Defining index limits for Right Subtree Preorder
        int siPreRight = eiPreLeft + 1;
        int eiPreRight = eiPre;

        BinaryTreeNode<Integer> left = buildTree(preOrder, inOrder, siPreLeft, eiPreLeft, siInLeft, eiInLeft);

        BinaryTreeNode<Integer> right = buildTree(preOrder, inOrder, siPreRight, eiPreRight, siInRight, eiInRight);

        root.left = left;
        root.right = right;

        return root;
    }
}
