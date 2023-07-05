
public class buy_or_sell_stock {
	public static int stockBuyAndSell(int n, int[] p) {
       int a=0  ;
       for(int i=1;i<n;i++) {
    	   if(p[i]>p[i-1]) {
    		   a=a+p[i]-p[i-1];
    	   }
       }
       return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
