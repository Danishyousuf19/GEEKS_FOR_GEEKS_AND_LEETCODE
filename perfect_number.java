
public class perfect_number {
	  public static boolean checkPerfectNumber(int num) {
	        int s=1;
	        if (num==1)
          return false;
	        for(int i=2;i<=Math.sqrt(num);i++){
	           if(num%i==0){
                 s+=i+num/i;
             }
          
	    }
         return s==num;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(checkPerfectNumber(28));
	}

}
