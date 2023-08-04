
public class power_of_3 {
    public boolean isPowerOfThree(int n) {
        if(n==0)return false;
        else if(n==1) return true;
        else if(n%3==0&&isPowerOfThree(n/3)) return true;
        return false;
    }
//    x power something == n
    boolean pow(int n ,int x) {
    	return (Math.log(n)/Math.log(x)%1==0);
    }
} 
