import java.util.Scanner;

public class kandanes {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number of elements: ");
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    for (int i = 0; i < n; i++) {
	      System.out.print("Enter a number: ");
	      arr[i] = sc.nextInt();
	    }
	    int currmax=arr[0],max=arr[0];
	    for(int i=1;i<n;i++)
	    {
	      if(currmax+arr[i]<arr[i])
	      {
	        currmax=arr[i];
	      }
	      else
	      currmax+=arr[i];
	      max=Math.max(currmax,max);
	    }
	    System.out.print("Largest sum contiguous subarray: "+max);
	  }
}
