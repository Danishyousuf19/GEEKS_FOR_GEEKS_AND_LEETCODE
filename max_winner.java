
public class max_winner {
	class Soljjjution {
	    public int getWinner(int[] arr, int k) {
	        if(k==1)return Math.max(arr[0],arr[1]);
	        if(k>arr.length)return max(arr);
	        int cmax=arr[0];
	        int c=0;
	        for(int i=1;i<arr.length;i++){
	            if(arr[i]<cmax)c++;
	            else{
	                cmax=arr[i];
	                c=1;
	            }
	            if(c==k)return cmax;
	        }
	        return cmax;
	    }
	    static int max(int a[]){
	        int big=a[0];
	        for(int i=1;i<a.length;i++){
	            if(a[i]>big)
	            big=a[i];
	        }
	        return big;
	    }
	}
}
