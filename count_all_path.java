
public class count_all_path {
	 public int isPossible(int[][] paths)
	    {
	        // Code here
	        for(int[] path:paths){
	            int degreesCount=0;
	            for(int degree:path) degreesCount+=degree;
	            if(degreesCount%2==1) return 0;
	        }
	        return 1;
	    }
}
