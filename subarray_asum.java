import java.util.ArrayList;
import java.util.Arrays;

public class subarray_asum {
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int st=0; 
        int l=0;
        boolean flag=false;
        int count=0;
       
        for(int i=0; i<n; i++){
            count=count+arr[i];
            if(count >=s){
                l=i;
                while(s<count && st<l){
                    count -=arr[st];
                    ++st;
                }
                if(count ==s){
                	return new ArrayList<>(Arrays.asList(st+1,l+1));
                }
            }
        }
        return new ArrayList<>(Arrays.asList(-1));
    }
}
