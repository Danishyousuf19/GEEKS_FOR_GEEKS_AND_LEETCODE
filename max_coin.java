
public class max_coin {
	 public int maxCoins(int[] piles) {
	        int coins=0;
	        int max=0;
	        for(int i:piles) {
	        	if(i>max)max=i;
	        }
	        int freq[]=new int[max+1];
	        for(int i:piles) {
	        	freq[i]++;
	        }
	        int turn=1;
	        int i=max;
	        int chance=piles.length/3;
	        while(chance!=0) {
	        	if(freq[i]>0) {
	        		if(turn==1)turn=0;
	        		else {
	        			turn=1;
	        			coins+=i;
	        			chance--;
	        		}
	        		freq[i]--;
	        	}
	        	else {
	        		i--;
	        	}
	        }
	        return coins;
	    }
}
