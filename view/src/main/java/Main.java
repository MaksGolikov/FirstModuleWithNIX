import data.TreeNode;
import service.impl.SecondLevel;

public class Main {
    public static void main(String[] args) {
        FirstLevel f1 = new FirstLevel();
        int[] arr = {1, 2, 3, 4, 4, 5, 3, 5, 6};
        System.out.println("---Level 1---");
        System.out.println("1 task: " + f1.returnNumberOfUniqueSymbols(arr));
        System.out.println("2 task: " + f1.moveOfHorse(1, 1, 2, 3));
        System.out.println("3 task: " + f1.areaOfTriangle(0, 0, 9, 0, 7, 9));

        SecondLevel s2 = new SecondLevel();
        TreeNode root = new TreeNode(20,
                new TreeNode(7, new TreeNode(4, null, new TreeNode(6)), new TreeNode(9)),
                new TreeNode(35,
                        new TreeNode(31, new TreeNode(28), null),
                        new TreeNode(40, new TreeNode(38), new TreeNode(52))));
        System.out.println("---Level 2---");
        System.out.println("1 task: " + s2.stringLogic("jk( vljsdv"));
        System.out.println("2 task: " + s2.depthOfBinaryTree(root));
    }
}
