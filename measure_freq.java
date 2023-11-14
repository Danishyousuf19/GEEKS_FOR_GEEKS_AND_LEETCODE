import java.util.HashMap;
import java.util.Scanner;

public class measure_freq {
	 public static void frequencyCount(int arr[], int N, int P)
	    {
	        // code here
		 HashMap<Integer,Integer>map=new HashMap<>();
		 for(int i=0;i<N;i++) {
			 map.put(arr[i],map.getOrDefault(arr[i], 1)+1 );
		 }
		 for(int i=0;i<N;i++) {
			 if(!map.containsKey(i+1)) {
				 arr[i]=0;
			 }
			 else {
				 arr[i]=map.get(i+1);
			 }
		 }
	    }
	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter number of elements: ");
		    int n = sc.nextInt();
		    System.out.print("Enter k: ");
		    int k = sc.nextInt();
		    k %= n;
		    int arr[] = new int[n];
		    int rotate[] = new int[n];
		    int index = 0, i;
		    System.out.print("Enter elements:");
		    for (i = 0; i < n; i++) {
		      arr[i] = sc.nextInt();
		    }

		    for (i = k; i < n; i++) {
		      rotate[index++] = arr[i];
		    }
		    for (i = 0; i < k; i++) {
		      rotate[index++] = arr[i];
		    }

		    for (int j = 0; j < n; j++) {
		      System.out.print(rotate[j] + "  ");
		    }
		  }
	 
}
