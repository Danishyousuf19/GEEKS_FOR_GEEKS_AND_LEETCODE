
public class max_freq {
	  public int maxFrequencyElements(int[] nums) {
		  int[] f = new int[101];
		    int maxFreq = 0, totalCount = 0;
		    for (int num : nums) {
		        f[num]++;
		        if (f[num] > maxFreq) {
		            maxFreq = f[num];
		            totalCount = f[num];
		        } else if (f[num] == maxFreq) {
		            totalCount += f[num];
		        }
		    }
		    return totalCount;
	    }
}
