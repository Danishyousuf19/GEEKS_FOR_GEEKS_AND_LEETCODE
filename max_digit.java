
public class max_digit {
	String solve(String N) 
    { 
        int ans=-1;
        int []arr=new int[10];
        for(int i=0;i<N.length();i++) {
        	arr[N.charAt(i)-'0']++;
        }
        int m=-1;
        for(int i=0;i<10;i++) {
        	if (arr[i]>m) {
        		m=arr[i];
        		ans=i;
        	}
        }
        return ans+"";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
