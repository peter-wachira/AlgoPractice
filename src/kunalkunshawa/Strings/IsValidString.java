package kunalkunshawa.Strings;

import java.util.HashMap;
import java.util.Stack;

public class IsValidString {
    public static void main(String[] args) {

    }

    /**
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * <p>
     * An input string is valid if:
     * <p>
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "()"
     * Output: true
     * Example 2:
     * <p>
     * Input: s = "()[]{}"
     * Output: true
     * Example 3:
     * <p>
     * Input: s = "(]"
     * Output: false
     */
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}