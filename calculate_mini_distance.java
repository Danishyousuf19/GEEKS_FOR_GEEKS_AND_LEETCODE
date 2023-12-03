
public class calculate_mini_distance {
	 public int minTimeToVisitAllPoints(int[][] points) {
	        int time=0;
	        for(int i=1;i<points.length;i++) {
	        	time+=cal(points[i-1],points[i]);
	        }
	        return time;
	    }
	 int cal(int []from,int []to) {
		 int x=Math.abs(from[0]-to[0]);
		 int y=Math.abs(from[1]-to[1]);
		 return Math.max(x, y);
	 }
}
