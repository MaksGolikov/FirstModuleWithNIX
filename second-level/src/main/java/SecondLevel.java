import java.util.*;

public class SecondLevel implements GeneralsMethod {


    private final Map<String, String> map = new HashMap<>() {{
        put("(", ")");
        put("{", "}");
        put("[", "]");
    }};


    public String stringLogic(String str) {
        if (str.isBlank()) {
            return "It is correct string";
        }
        if (!str.contains("(") | !str.contains("{") | !str.contains("[")) {
            return "This string - " + str + " - incorrect!";
        }

        String[] listOfSymbolsInString = str.split("");
        Stack<String> stackOfOpenSymbols = new Stack<>();

        for (int i = 0; i < listOfSymbolsInString.length; i++) {
            for (Map.Entry<String, String> me : map.entrySet()) {
                if (listOfSymbolsInString[i].equals(me.getKey())) {
                    stackOfOpenSymbols.push(listOfSymbolsInString[i]);
                    break;
                }
                if (stackOfOpenSymbols.empty() && listOfSymbolsInString[i].equals(me.getValue())) {
                    return "This string - " + str + " - incorrect!";
                }
                if (listOfSymbolsInString[i].equals(me.getValue())) {
                    if (stackOfOpenSymbols.peek().equals(me.getKey())) {
                        stackOfOpenSymbols.pop();
                        break;
                    } else {
                        return "This string - " + str + " - incorrect!";
                    }
                }
            }
        }
        return "It is correct string";
    }

    public int depthOfBinaryTree(TreeNode root) {
        return maxDepth(root);
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int Left = maxDepth(root.left);
        int Right = maxDepth(root.right);
        return Math.max(Left, Right) + 1;
    }
}
