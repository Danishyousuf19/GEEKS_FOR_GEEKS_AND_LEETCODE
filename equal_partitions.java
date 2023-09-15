
public class equal_partitions {
	//brute force
	static int equalPartition(int N, int arr[])
    {
        int s=0;
        for(int n:arr) {
        	s+=n;
        	
        }
        if(s%2!=0)return 0;
        int ts=s/2;
        if(canBe(arr,N,ts)) {
        	return 1;
        	
        }
        else {
        	return 0;
        }
    }
	static boolean canBe(int a[],int n,int t) {
		if(t==0)return true;
		if(n==0||t<0)return false;
		return canBe(a,n-1,t-a[n])||canBe(a,n-1,t);
	}
}
