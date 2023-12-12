
public class max_product {
	 public int maxProduct(int[] nums) {
	        int big=0,sbig=0;
	        for(int e:nums){
	            if(e>big){
	                sbig=big;
	                big=e;
	            }
	            else{
	              sbig=  sbig<e?e:sbig;
	            }
	        }return (big-1)*(sbig-1);
	    }
}
