
public class max_column {

    static int columnWithMaxZero(int a[][],int n){
        int max=0;
        int f=-1;
        for(int i=0;i<n;i++) {
        	int c=0;
        	
        	for(int j=0;j<n;j++) {
        		if(a[j][i]==0) {
        			c++;
        		}
        		if(c>max) {
        			max=c;
        			f=i;
        		}
        	}
        }
        return f;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
