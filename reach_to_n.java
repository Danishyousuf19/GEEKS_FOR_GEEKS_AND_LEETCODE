
public class reach_to_n {
static int reach(int n) {
	int c=1;
	while(n!=1) {
		if(n%2==0)n/=2;
		else n--;
		c++;
	}
	return c;
}
}
