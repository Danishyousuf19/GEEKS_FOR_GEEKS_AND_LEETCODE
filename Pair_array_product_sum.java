
public class Pair_array_product_sum {

	 static int CountPairs (int arr[], int n) 
	    {
		 int two=0;
		 int other=0;
		 for(int x:arr) {
			 if(x==2) {
				 two++;
				 
			 }
			 else if(x>2) {
				 other ++;
			 }
		 }
		 int ans =two*other+(other*(other-1))/2;
		 return ans;
	        
//		 The first term two * other represents the count of pairs where o
//		 ne element is 2 and the other is greater than 2.
//		 The second term (other * (other-1))/2 represents the count of pai\
//		 rs where both elements are greater than 2. The
//		 (other-1) part calculates the number of possible combinations of se
//		 lecting two elements from other, and then dividing 
//		 by 2 eliminates duplicate pairs (since the order doesn't matter in pairs).
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Given a array a[] of non-negative integers. Count the number of
//pairs (i, j) in the array such that a[i] + a[j] < a[i]*a[j]. (the pair
//		(i, j) and (j, i) are considered same and i should not be equal to j)
//
