
public class largestPrimeFactor {
int lp(int n) {
	int ans=2;
	while(n%2==0)n/=2;
	for(int i=3;i<=n;i+=2) {
		if(n%i==0) {
			ans=i;
			while(n%i==0) {
				n/=i;
			}
		}
	}
	return ans;
}
}
