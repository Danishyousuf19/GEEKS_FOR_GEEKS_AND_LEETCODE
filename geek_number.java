
public class geek_number {
	static int geekNumber(int n){
     for(int i=2;i<=Math.sqrt(n);i++) {
    	 int c=0;
    	 while(n%i==0) {
    		 c++;
    		 n/=i;
    	 }
    	 if(c>1)
    		 return 0;
     }
		return 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
