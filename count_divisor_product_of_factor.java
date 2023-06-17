
public class count_divisor_product_of_factor {
    public long countDivisorsMult(long arr[], long n)
    {
    	    long mult=1;    
for(long e:arr) {
mult*=e;
}
long count =2;
for(int i=2;i<=Math.sqrt(mult);i++) {
if(mult%i==0) {
	if(i*i==mult) {
	count++;}
	else {
		count+=2;
	}
}
}
    
    
    return count;}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
