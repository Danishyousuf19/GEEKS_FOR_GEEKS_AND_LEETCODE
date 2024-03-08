
public class instr {
static String instr(String a,int n) {
	String res="";
	
	int i=0,j=0;
	while(i<n&&j<n) {
		String sub=a.substring(i,j+1);
		if(a.substring(j+1,n).indexOf(sub)!=-1) {
			res=res.length()<(j-i+1)?sub:res;
			
		}
		else {
			i++;
		}
		j++;
	}
	return res;
	
}
}
