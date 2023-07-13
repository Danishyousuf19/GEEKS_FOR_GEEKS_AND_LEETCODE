import java.util.*;

public class unique_occurrence {
	 public static boolean isFrequencyUnique_upto_n(int n, int[] arr) {
		 
		 int freq[]=new int [n];
		 for(int i=0;i<n;i++) {
			 freq[arr[i]]++;
		 }
		 Arrays.sort(freq);
		 for(int i=0;i<n-1;i++) {
			 if(freq[i]==freq[i+1])
				 return false;
		 }
	        return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean isFrequencyUnique(int n, int[] arr) {
		HashMap <Integer,Integer> map=new HashMap<>();
		for(int i :arr) {
			map.put(i, map.getOrDefault(i,0)+1);
		}
		HashSet<Integer>set=new HashSet<>();
		for(int i:map.values()) {
			if(!set.contains(i)) {
				set.add(i);
			}
			else {
				return false;
			}
		}
		return true;

	}

}
