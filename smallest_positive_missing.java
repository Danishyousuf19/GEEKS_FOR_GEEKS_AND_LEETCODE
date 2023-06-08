import java.util.Arrays;

public class smallest_positive_missing {
	 static int missingNumber(int arr[], int size)
	    {
	        Arrays.sort(arr);
	        int posInteger = 1;
	        
	        for (int i = 0; i < size; i++) 
	        {
	            int currNo = arr[i];
	            if (currNo == posInteger) 
	            {
	                posInteger++;
	            }
	            else{
	                continue;
	            }
	        }
	         
	        return posInteger;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(missingNumber(new int [] {13,-2,3,4},4));

	}

}
