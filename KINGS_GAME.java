import java.util.Arrays;

//King is getting ready for a war. He know his strengths and weeknesses 
//so he is taking required number of soldiers with him. King can only 
//defeat enemies with strongest and weakest power, and one soldier can 
//only kill one enemy. Your task is to calculate that 
//how many soldiers are required by king to take with him for the war
public class KINGS_GAME {
	public static long SoldierRequired(long arr[], long n)
    {long sum=0;  Arrays.sort(arr); 
    long min=arr[0];
    long max=arr[arr.length-1];
       
         for(int i=1;i<arr.length-2;i++) {
        	 if(arr[i]==min||arr[i]==max) {
        		 continue;
        	 }
        	 else {
        		 sum++;
        	 }
         }
         return sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
