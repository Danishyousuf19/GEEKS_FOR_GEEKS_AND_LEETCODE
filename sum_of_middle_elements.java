import java.util.Arrays;

public class sum_of_middle_elements {
	 int findMidSum(int[] a1, int[] a2, int n) {
	        Arrays.sort(a1);
	        Arrays.sort(a2);
	        int i=0;int j=n-1;
	        while(j>=0&&i<n) {
	        	if(a1[j]>a2[i]) {
	        		//swap
	        		int t=a1[j];
	        		a1[j]=a2[i];
	        		a2[i]=t ;
	        		j--;
	        		i++;
	        		
	        	}
	        	else {
	        		break;
	        	}
	        }
	        Arrays.sort(a1);
	        Arrays.sort(a2);
	        return a1[n-1]+a2[0];
	        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
