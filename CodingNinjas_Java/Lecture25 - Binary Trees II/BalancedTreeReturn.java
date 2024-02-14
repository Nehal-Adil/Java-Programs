package BinaryTree;

public class BalancedTreeReturn {
    int height;
    boolean isBalanced;

    static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            int height = 0;
            boolean isBal = true;
            BalancedTreeReturn ans = new BalancedTreeReturn();
            ans.height = height;
            ans.isBalanced = isBal;

            return ans;
        }
        BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
        BalancedTreeReturn rightOutput = isBalancedBetter(root.right);

        boolean isBal = true;
        int height = 1 + Math.max(leftOutput.height, rightOutput.height);

        if (Math.abs(leftOutput.height - rightOutput.height) > 1) {
            isBal = false;
        }
        if (!leftOutput.isBalanced || !rightOutput.isBalanced) {
            isBal = false;
        }

        BalancedTreeReturn ans = new BalancedTreeReturn();
        ans.height = height;
        ans.isBalanced = isBal;

        return ans;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInput_Better(true, 0, true);
        System.out.println("Is Balanced: " + isBalancedBetter(root).isBalanced);
        BinaryTreeUse.printTreeDetailed(root);
    }
}
