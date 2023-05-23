
public class max_string_in_array {
	 static String longest(String names[], int n) {
	        String max="";
	        for (int i=0;i<n;i++){
	            int c=max.length();
	            int length_of=names[i].length();
	            if(length_of>c) {
	            	max=names[i];
	            }
	        }
	        return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String names[] = { "Geek", "Geeks", "Geeksfor"};
String c= longest(names,3);
System.out.println(c);
	}

}
