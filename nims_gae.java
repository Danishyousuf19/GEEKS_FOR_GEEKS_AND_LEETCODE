
public class nims_gae {
	static int findWinner(int n, int A[]){
        // code here
        int v=0;
        if(n%2==0)return 1;
        for(int i:A){
            v^=i;
        }
        return v==0? 1:2;
    
    }
}
