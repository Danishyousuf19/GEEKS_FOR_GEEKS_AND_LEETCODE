import java.util.*;
public class convert1d_to_2d {
	 public List<List<Integer>> findMatrix(int[] nums) {
         Map<Integer, Integer> fm = new HashMap<>();
         for(int i:nums){
fm.put(i, fm.getOrDefault(i, 0) + 1);
         }
     List<List<Integer>> ans = new ArrayList<>();
     while(!fm.isEmpty()){
          List<Integer> temp = new ArrayList<>();
            List<Integer> toErase = new ArrayList<>();
            for(Map.Entry<Integer,Integer>entry:fm.entrySet()){
                int f=entry.getKey();
                int m=entry.getValue();
                temp.add(f);
                m--;
                if(m==0){
                    toErase.add(f);
                }
                fm.put(f,m);
            }
            ans.add(temp);
            for(int i:toErase){
                fm.remove(i);
            }
     }    
     return ans;
    }
	  public List<List<Integer>> finhdMatrix(int[] nums) {
        int freq[] = new int[nums.length + 1];

        ArrayList<List<Integer>> ans = new ArrayList<>();
        for (int c : nums) {
            if (freq[c] >= ans.size()) {
                ans.add(new ArrayList<>());
            }

            // Store the integer in the list corresponding to its current frequency.
            ans.get(freq[c]).add(c);
            freq[c]++;
        }

        return ans;
    }
}
