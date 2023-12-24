import java.util.PriorityQueue;

public class stock_prob {
	static class pair implements Comparable<pair>{
        int p;
        int d;
        pair(int p,int d){
            this .p=p;
            this.d=d;
        }
        public int compareTo(pair other){
            return Integer.compare(this.p,other.p);
        }
    }
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        PriorityQueue<pair>pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.offer(new pair(price[i],i+1));
        }
        int c=0;
        while(!pq.isEmpty()){
            pair curr=pq.poll();
            int cp=curr.p;
            int cd=curr.d;
            int stb=Math.min(cd,k/cp);
            k-=stb*cp;
            c+=stb;
        }
          return c;
    }
}
