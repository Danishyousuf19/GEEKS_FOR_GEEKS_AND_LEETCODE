//The two countries of A and B are at war against each other. Both countries have N number of 
//soldiers. The power of these soldiers are given by A[i]...A[N] and B[i]....B[N].
//These soldiers have a peculiarity. They can only attack their counterpart enemies, like A[i] 
//can attack only B[i] and not anyone else. A soldier with higher power can kill the enemy 
//soldier. If both soldiers have the same power, they both die. You need to find the winner country.
public class country_at_war {
	 public static String Country_at_war (int arr[], int brr[], int n) {
	        int ca=0;
	        int cb=0;
	        for(int i=0;i<n;i++) {
	        	if(arr[i]>brr[i]) {
	        		ca++;
	        	}
	        	else if(arr[i]<brr[i]) {
	        		cb++;
	        	}
	        }
	        if(ca>cb) {
	        	return "A";
	        	
	        }else if (ca<cb) {
	        return "B";}
	        return "DRAW";
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
