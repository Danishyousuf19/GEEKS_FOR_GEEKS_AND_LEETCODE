
public class Excel_sheet_column_title{
public String convertToTitle(int n) {
        if(n<27) return Character.toString('A'+(n-1));
        StringBuilder sb=new StringBuilder();
        while(n>0) {
        	if(n%26==0) {sb.append('Z');n-=1;}
        	else {
        		sb.append((char)('A'+n%26-1));
        	}
        	n/=26;
        }
        return sb.reverse().toString();
    }
public String convert(int n) {
	 if(n<27) return Character.toString('A'+(n-1));
     StringBuilder sb=new StringBuilder();
     while(n>0) {
    	 sb.insert(0,(char)( 'A'+(n-1)%26));
    	 n=(n-1)/26;
     }
     return sb.toString();
}
}
