package service.impl;

import data.TreeNode;
import service.GeneralsMethod;

import java.util.*;

import static util.StringUtil.isNotValidString;
import static util.StringUtil.maxDepth;

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

        for (Map.Entry<String, String> me : map.entrySet()) {
            if (isNotValidString(str, me.getKey(), me.getValue())) {
                return "This string - " + str + " - incorrect!";
            }
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

}
