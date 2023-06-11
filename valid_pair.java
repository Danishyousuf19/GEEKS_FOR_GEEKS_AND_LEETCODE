
public class valid_pair {
	 static long ValidPair(int a[], int n) 
		{ 
		    long count=0;
		    int i=0;int j=n-1;
		    while(j>=0) {
		    	if(i==j) {
		    		break;
		    	}
		    	else if(a[i]+a[j]>0){
		    		count=count+(j-i);j--;
		    	}
		    	else {
		    		i++;
		    	}
		    }
		    return count;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
