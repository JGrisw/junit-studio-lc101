package main;


import java.util.ArrayList;
import java.util.Objects;

public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        int leftB = 0;
        int rightB = 0;
        boolean balanced = false;
        ArrayList<Character> bList = new ArrayList<>();
        if(str.equals("")){return true;}
        if(!str.contains("[") && !str.contains("]")){return false;}
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                bList.add(ch);
                leftB++;
            } else if (ch == ']') {
                bList.add(ch);
                rightB++;
            }
        }
        if(Objects.equals(leftB, rightB)) {
            if (bList.indexOf('[') == 0) {
                brackets++;
            }
            if (bList.indexOf(']') == 1) {
                brackets++;
            }
            if (brackets == 2) {
                System.out.println("ding!");
                balanced = true;
            }
        }
        System.out.println(bList);
        return balanced;
    }
    public static void main(String[] args) {
        hasBalancedBrackets("[]");

    }
}
