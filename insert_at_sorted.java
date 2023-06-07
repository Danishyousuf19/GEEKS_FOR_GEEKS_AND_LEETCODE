
public class insert_at_sorted {
	 static int searchInsertK(int Arr[], int N, int k)
	    {
		 if(Arr[Arr.length-1]==k) {
			 return Arr.length-1;
		 }
	       for(int i=0;i<Arr.length-1;i++) {
	    	   
	    	   if(Arr[i]==k) {
	    		   return i;
	    	   }
	    	   else if(Arr[i]<k&Arr[i+1]>k) {
	    		   return i+1;
	    	   }
	       }
	       return 1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
