import java.util.ArrayList;
import java.util.List;

public class permutation_arraylist {
	 static void helper(String s, String permu, List<String> list) {
	        if (s.length() == 0) {
	            list.add(permu);
	            return; 
	        }
	        for (int i = 0; i < s.length(); i++) {
	            char current = s.charAt(i);
	            String newString = s.substring(0, i) + s.substring(i + 1);
	            helper(newString, permu + current, list);
	        }
	    }

	    public static List<String> findPermutation(String S) {
	        ArrayList<String> list = new ArrayList<>();
	        helper(S, "", list);
	        return list;
	    }

	    public static void main(String[] args) {
	        String input = "ABC";
	        List<String> permutations = findPermutation(input);
	        for (String permutation : permutations) {
	            System.out.println(permutation);
	        }
	    }

}
//ABC
//ACB
//BAC
//BCA
//CAB
//CBA
