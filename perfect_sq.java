
public class perfect_sq {
boolean chk(int n) {
	int i=1,j=n;
	while(i<=j) {
		int m=(i+j)/2;
		if(m*m==n)return true;
		else if(m*m>n)j=m-1;
		else i=m+1;
	}
	return false;
}
}
