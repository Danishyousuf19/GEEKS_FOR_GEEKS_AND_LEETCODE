import java.util.HashMap;
import java.util.Map;

public class count_occr {
	public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        int dv=n/k;
       int c=0;
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i:arr){
           map.put(i,map.getOrDefault(i,0)+1);
       }
       for(Map.Entry<Integer, Integer> element : map.entrySet()){
           if(element.getValue()>dv)c++;
       }
       
        return c;
    }
}
