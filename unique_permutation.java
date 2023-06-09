import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class unique_permutation {
	static void helper(String s, int idx,String nue, List<String> list, HashSet<String>set) {
	    //   static void sub(String s,int idx,String nue,HashSet<String> set) {
			
			if(idx==s.length())
			{
				if (set.contains(nue)) {
					return;
				}else {
				list.add(nue);
				set.add(nue);
				return;
			}
				}
			char current=s.charAt(idx);
			//to be
			helper(s,idx+1,nue+current,list, set);
			//not to be
			helper(s,idx+1,nue,list, set);
			
			
		}
	       

	    public static List<String> find_permutation(String S) {
	        ArrayList<String> list = new ArrayList<>();
	        helper(S, 0,"", list, new HashSet<>());
	        return list;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "ABB";
	        List<String> permutations = find_permutation(input);
	        for (String permutation : permutations) {
	            System.out.println(permutation);
	        }
	}

//
	}
//ABB
//AB
//A
//BB
//B

