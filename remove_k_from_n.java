import java.util.Stack;

public class remove_k_from_n {
    public String removeKdigits(String num, int k) {
    if (num.length() == k) return "0";

        Stack<Character> stack = new Stack<>();
        for (char digit : num.toCharArray()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        // If there are still digits to remove
        for (; k > 0; k--) {
            stack.pop();
        }

        // Build the final string, while removing leading zeros
        StringBuilder ret = new StringBuilder();
        boolean leadingZero = true;
        for (char digit : stack) {
            if (leadingZero && digit == '0') continue;
            leadingZero = false;
            ret.append(digit);
        }

        return ret.length() == 0 ? "0" : ret.toString();
    }
}
