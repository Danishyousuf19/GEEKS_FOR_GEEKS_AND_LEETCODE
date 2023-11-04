
public class ant_plank_problem {
	 public int getLastMoment(int n, int[] left, int[] right) {    int maxLeft = 0;
     for (int le : left) {
         maxLeft = Math.max(maxLeft, le);
     }
     
     int minRight = n;
     for (int re : right) {
         minRight = Math.min(minRight, re);
     }
     
     return Math.max(maxLeft, n - minRight);
 }
}

