
public class task_scheduler {
	 static int leastInterval(int N, int K, char tasks[]) {
	       int max=-1;
	       int c=0;
	       int freq[]=new int[26];
	       for(int i:tasks) {
	    	   freq[i-'A']++;
	       }
	       for(int i=0;i<26;i++) {
	    	   
	    	   if(freq[i]==max) {
	    		   c++;
	    	   }
	    	   else if(freq[i]>max){
	    		   max=freq[i];
	    		   c=1;
	    	   }
	    	   
	       }
	       //required time
	       int ans=Math.max(N, max+(max-1)*K+(c-1));
	       return ans;
	       
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
