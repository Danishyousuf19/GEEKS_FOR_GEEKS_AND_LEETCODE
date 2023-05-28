import java.util.Arrays;

public class SortString {

	
	static String sort(String s) 
	
    {
        char d[]=s.toCharArray();
        Arrays.sort(d);
        String re="";
        for (int i=0;i<d.length;i++) {
        	re=re+d[i];
        }
//        String n = String.valueOf(d);
//        return n;
        return re;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
