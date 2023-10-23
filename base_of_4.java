
public class base_of_4 {
public boolean isPowerOfFour(int n) {
        if(n<=0)return false;
        if(n==1)return true;
        double base=Math.log(n)/Math.log(4);
        return base==(int)base;
        		
    }
}
