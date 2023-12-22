import java.util.*;

public class meeting {
	 public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
	        // code here
	       List<int[]> al=new ArrayList<>();
	        for(int i=1;i<=N;i++) al.add(new int[]{S[i-1],F[i-1],i});
	        Collections.sort(al,(x,y)->x[1]-y[1]);
	        int lastF=-1;
	        ArrayList<Integer> ans=new ArrayList<>();
	        for(int[] a:al){
	            if(a[0]>lastF){
	                lastF=a[1];
	                ans.add(a[2]);
	            }
	        }
	        Collections.sort(ans);
	        return ans;}
}
