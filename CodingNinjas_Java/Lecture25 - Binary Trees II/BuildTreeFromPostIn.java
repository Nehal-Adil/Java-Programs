package CodingNinjas_DSA;

public class BuildTreeFromPostIn {

    // Build Tree from PostOrder and InOrder
    static BinaryTreeNode<Integer> buildTreeFromInPost(int[] postOrder, int[] inOrder) {
        BinaryTreeNode<Integer> root = buildTreeFromInPost_helper(postOrder, inOrder, 0, postOrder.length - 1, 0, inOrder.length - 1);
        return root;
    }

    // Build Tree from PostOrder and InOrder - helper function
    static BinaryTreeNode<Integer> buildTreeFromInPost_helper(int[] postOrder, int[] inOrder, int siPost, int eiPost, int siIn, int eiIn) {

        if (siPost > eiPost) {
            return null;
        }

        int rootData = postOrder[eiPost];
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
        int siPostLeft = siPost;
        int leftSubTreeLength = eiInLeft - siInLeft + 1;
        int eiPostLeft = (siPostLeft) + (leftSubTreeLength - 1);

        //Defining index limits for Right Subtree Inorder
        int siInRight = rootIndex + 1;
        int eiInRight = eiIn;

        //Defining index limits for Right Subtree Preorder
        int siPostRight = eiPostLeft + 1;
        int eiPostRight = eiPost - 1;

        BinaryTreeNode<Integer> left = buildTreeFromInPost_helper(postOrder, inOrder, siPostLeft, eiPostLeft, siInLeft, eiInLeft);

        BinaryTreeNode<Integer> right = buildTreeFromInPost_helper(postOrder, inOrder, siPostRight, eiPostRight, siInRight, eiInRight);

        root.left = left;
        root.right = right;

        return root;

    }

}
