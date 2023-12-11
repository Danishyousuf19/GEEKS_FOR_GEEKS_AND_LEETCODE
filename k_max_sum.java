import java.util.ArrayList;

public class k_max_sum {
	static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
       long s=0l,s2=0l;
        for(int i=0;i<K;i++){
            s+=Arr.get(i);
        }
        s2=s;
        for(int i=K;i<N;i++){
            s+=Arr.get(i);
            s-=Arr.get(i-K);
            s2=Math.max(s2,s);
        }return s2;
    }
}
