package util;

import data.TreeNode;

public class StringUtil {

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int Left = maxDepth(root.getLeft());
        int Right = maxDepth(root.getRight());
        return Math.max(Left, Right) + 1;
    }

    public static boolean isNotValidString(String str, String left, String right) {
        if(str.contains(left) || str.contains(right)){
            return !(str.contains(left) && str.contains(right));
        }
        return false;
    }
}
