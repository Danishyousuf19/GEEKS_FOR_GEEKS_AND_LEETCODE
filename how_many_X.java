
public class how_many_X {
	 int countX(int L, int R, int X) {
	        // code here
	        int a=0;
	        for(int i=L+1;i<R;i++){
	            int c=i;
	            while(c>0){
	                if(c%10==X)a++;
	                c/=10;
	            }
	            
	        }return a;
	        
	    }
}
