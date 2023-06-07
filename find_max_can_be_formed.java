import java.util.Arrays;

public class find_max_can_be_formed {
	static String findMax(String N) {
     String a="";
    char ch[]=new char[N.length()];
    for(int i=0;i<N.length();i++) {
    	ch[i]=N.charAt(i);
    }
    Arrays.sort(ch);
    for(int i=N.length()-1;i>=0;i--) {
    	a=ch[i]+a;
    }
    return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
