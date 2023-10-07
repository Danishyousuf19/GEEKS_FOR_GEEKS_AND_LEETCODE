
public class str_to_no {
public int myAtoi(String s) {
      double ans=0;
      int i=0;
      while(i<s.length()&&s.charAt(i)==' ') {
    	  i++;
      }
      int p=0,n=0;
      if(i<s.length()&&s.charAt(i)=='+') {
    	  p++;
    	  i++;
      }
      if(i<s.length()&&s.charAt(i)=='-') {
    	  n++;
    	  i++;
      }
      while(i<s.length()&& s.charAt(i) >= '0' && s.charAt(i) <= '9') {
    	  ans=ans*10+(s.charAt(i)-'0');i++;
      }
      if(n>0) {
    	  ans=-ans;
      }
      if(n>0&&p>0) {
    	  return 0;
      }
      int max=Integer.MAX_VALUE;
      int min=Integer.MIN_VALUE;
      if(ans>max)return max;
      if(ans<min)return min;
      
        return (int) ans;
    }
}
