package BinaryTree;

public class MirrorBinaryTree {
    static void mirrorBT(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        mirrorBT(root.left);
        mirrorBT(root.right);

        BinaryTreeNode<Integer> tempLeft = root.left;
        root.left = root.right;
        root.right = tempLeft;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInput_Better(true, 0, true);
        mirrorBT(root);
        BinaryTreeUse.printTreeDetailed(root);
    }
}
