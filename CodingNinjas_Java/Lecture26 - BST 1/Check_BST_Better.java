package BinaryTree;

public class Check_BST_Better {
    int min;
    int max;
    boolean isBST;

    Check_BST_Better(int min, int max, boolean isBST) {
        this.min = min;
        this.max = max;
        this.isBST = isBST;
    }

    static Check_BST_Better isBST2(BinaryTreeNode<Integer> root) {
        if (root == null) {
            Check_BST_Better ans = new Check_BST_Better(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
            return ans;
        }

        Check_BST_Better leftAns = isBST2(root.left);
        Check_BST_Better rightAns = isBST2(root.right);

        int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
        int max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
        boolean isBST = true;

        if (leftAns.max >= root.data) {
            isBST = false;
        }
        if (rightAns.min < root.data) {
            isBST = false;
        }
        if (!leftAns.isBST) {
            isBST = false;
        }
        if (!rightAns.isBST) {
            isBST = false;
        }

        Check_BST_Better ans = new Check_BST_Better(min, max, isBST);
        return ans;
    }

    static boolean isBST3(BinaryTreeNode<Integer> root, int minRange, int maxRange) {
        if (root == null) {
            return true;
        }

        if (root.data < minRange || root.data > maxRange) {
            return false;
        }

        boolean isLeftWithinRange = isBST3(root.left, minRange, root.data - 1);
        boolean isRightWithinRange = isBST3(root.right, root.data, maxRange);

        return isLeftWithinRange && isRightWithinRange;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputLevelWise();
        Check_BST_Better ans = isBST2(root);
        System.out.println(ans.min + " " + ans.max + " " + ans.isBST);

        System.out.println("isBST3: " + isBST3(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
