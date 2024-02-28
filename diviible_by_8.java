
public class diviible_by_8 {
	int DivisibleByEight(String s){
        int len = s.length();
        if(len<=2){
            if(Integer.parseInt(s)%8==0) return 1;
        }
        int val=0;
        for(int i=len-3;i<len;i++){
            val=(val*10)+s.charAt(i)-'0';
        }
        if(val%8==0) return 1;
        return -1;
    
}}
