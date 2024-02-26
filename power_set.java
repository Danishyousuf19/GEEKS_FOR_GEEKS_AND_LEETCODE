import java.util.*;
public class power_set {
	public List<String> AllPossibleStrings(String s) {
        List<String> result = new ArrayList<>();
        generateSubsequences(s, "", result);
        Collections.sort(result); // Sorting the result lexicographically
        return result;
    }

    private void generateSubsequences(String original, String current, List<String> result) {
        if (!current.equals("")) { // Exclude empty string
            result.add(current);
        }
        for (int i = 0; i < original.length(); i++) {
            generateSubsequences(original.substring(i + 1), current + original.charAt(i), result);
        }
    }
}
