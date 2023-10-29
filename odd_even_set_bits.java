
public class odd_even_set_bits {
int[]ans(int n){
	int a[]= {0,0};
	int l=0;
	while(n>0) {
		int r=n&1;
		if(r==1) {
			if(l%2==0) {
				a[0]++;
			}
			else {
				a[1]++;
			}
		}
	}
	return a;
	
}
}
