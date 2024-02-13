package CodingNinjas_DSA;

public class NumOfNodes {

    static class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int numNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftCount = numNodes(root.left);
        int rightCount = numNodes(root.right);

        return 1 + leftCount + rightCount;
    }
}
