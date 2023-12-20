
public class buy_chocolate {
	public int buyChoco(int[] arr, int m) {
        int ans=Integer.MAX_VALUE;
        int fin=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    ans=Math.min(arr[i]+arr[j],ans);
                }
            }
        }
        fin=m-ans;
        return fin>=0?fin:m;
    }
}
