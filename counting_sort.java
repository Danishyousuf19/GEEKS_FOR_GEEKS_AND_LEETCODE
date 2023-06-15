
public class counting_sort {
	public static String countSort(String arr)
    {int a[]=new int [26];
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<arr.length();i++) {
    	a[arr.charAt(i)-97]++;
    }
    	for(int i=0;i<26;i++) {
    		for(int j=0;j<a[i];j++) {
    			 sb.append((char)(i+97));
    		}
    	}
    return sb.toString();
        // code here
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
