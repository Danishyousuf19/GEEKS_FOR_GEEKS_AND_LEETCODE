import java.util.ArrayList;

public class number_pattern {
	 ArrayList<String> numberPattern(int N){
         ArrayList <String>list=new ArrayList<String>();
         StringBuilder sb = new StringBuilder();
	        for(int i=1;i<=N;i++) {
	        	for(int j=1;i<=i;j++) {
	        		sb.append(j);
	        	}
	        	for (int j = i - 1; j >= 1; j--) {
			sb.append(j);
	        	    
	        	}
	        	sb.append(" ");
	        
	        }
	        list.add(sb.toString());
	        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//For a given number N. Print the pattern in the following form: 1 121 12321 1234321 for N = 4.