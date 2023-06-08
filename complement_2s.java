
public class complement_2s {
	static String complement(String bi){
       char ch[]=bi.toCharArray()
    		   ;
       for(int i=0;i<ch.length;i++) {
    	   if(ch[i]=='0') {
    		   ch[i]='1';
    	   }
    	   else {
    		   ch[i]='0';
    	   }
       }
       for(int i=ch.length-1;i>=0;i--) {
    	   if(ch[i]=='0') {
    		   ch[i]='1';break;
    	   }
    	   else {
    		   ch[i]='1';
    	   }
       }
       String str=new String (ch);
       
       return str;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
