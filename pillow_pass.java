
public class pillow_pass {
	

	    public static int passThePillow(int n, int time) {
	        int updatedN = n - 1;
	        int rotation = time / updatedN;
	        int left = time % updatedN;
	        
	        if (rotation % 2 == 1) {
	            return n - left;
	        } else {
	            return 1 + left;
	        }
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int n = 5;
	        int time = 7;
	        int result = passThePillow(n, time);
	        System.out.println("Result: " + result);
	    }
	

}
