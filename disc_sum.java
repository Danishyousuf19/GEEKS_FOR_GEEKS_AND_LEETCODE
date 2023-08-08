import java.util.ArrayList;

public class disc_sum {
static void disc(String p,int t) {
	if(t==0) {
		System.out.println(p);
		return ;
	}
	for(int i=1;i<=t&&i<=6;i++) {
		disc(p+i,t-i);
	}
}
static ArrayList<String> ret(String p,int t) {
	if(t==0) {
		 ArrayList<String> l=new ArrayList<>();
		 l.add(p);
		 return l;
	}
	ArrayList<String>l=new  ArrayList<>();
	for(int i=1;i<=6&&i<=t;i++) {
		l.addAll(ret(p+i,t-i));
	}
	return l;
}
//with n faces
static void disc(String p,int t,int n) {
	if(t==0) {
		System.out.println(p);
		return ;
	}
	for(int i=1;i<=t&&i<=n;i++) {
		disc(p+i,t-i,n);
	}
}
}
