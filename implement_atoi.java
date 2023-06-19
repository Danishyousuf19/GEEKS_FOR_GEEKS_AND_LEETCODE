
public class implement_atoi {
	int atoi(String str) {
		// Your code here
		int ans =0;
			boolean flag=false;
			
			for(int i=0;i<str.length();i++) {
				ans=ans*10;
				int v=str.charAt(i)-'0';
				if(i==0&&v<0) {
					flag =true;continue;
				}
				 if(v<0|v>9) {
					return -1;
				}
				ans+=v;
			}
			if(flag==true) {
				ans*=-1;
			}
			return ans;
		    
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
