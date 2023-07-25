import java.util.*;

public class print_in_stream {
	 public String FirstNonRepeating(String A)
	    {
		 StringBuilder ans= new StringBuilder();
		 HashMap<Character ,Integer> map=new HashMap<>();
		 Queue<Character>q=new LinkedList<>();
		 int arr[]=new int [26];
		 for(int i=0;i<A.length();i++) {
			 char ch=A.charAt(i);
			 arr[ch-'a']++;
			 q.add(ch);
			 while(!q.isEmpty()) {
				 if(arr[q.peek()-'a']==1) {
					 ans.append(q.peek());
					 break;
				 }
				 else {
					 q.poll();
				 }
			 }
			 if(q.isEmpty()) {
				 ans.append("#");
			 }
			 
		 }
		 
		 return ans.toString();
	        
	    }
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
System.out.println(FirstNonRepeating2darray("abacab"));
		}
	 public  static String FirstNonRepeating2darray(String A)
	    {
		 StringBuilder ans= new StringBuilder();
		 int freq[][]=new int[26][2];
		 for(int i=0;i<A.length();i++) {
			 char ch=A.charAt(i);
			 freq[ch-'a'][0]++;//Increase frequency
			 freq[ch-'a'][1]=i;//store index;
			 int res_ch=-1;
			 int min=Integer.MAX_VALUE;
//			 get char of frequency =1 and minimum index
			 for(int j=0;j<26;j++) {
				 if(freq[j][0]==1&&freq[j][1]<min) {
					 min=freq[j][1];
					 res_ch=j;//store that character
				 }
			 }
			 if(res_ch==-1)
				 ans.append("#");
			 else
				 ans.append((char)(res_ch+'a'));
		 }
		 return ans.toString();
	    }
	 
}
