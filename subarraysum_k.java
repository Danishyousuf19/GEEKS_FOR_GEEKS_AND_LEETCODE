import java.util.*;
public class subarraysum_k {
	static int findSubArraySum(int Arr[], int N, int k)
    {
    int ans=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
       map.put(0, 1);
        for(int j=0;j<Arr.length;j++) {
        	sum+=Arr[j];
        	if(map.containsKey(sum-k)) {
        		ans+=map.get(sum-k);
        	}
        	if(map.containsKey(sum)) {
        		
        		map.put(sum, map.get(sum)+1);
        	}
        	else{
        		map.put(sum, 1);
        	}
        		
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
