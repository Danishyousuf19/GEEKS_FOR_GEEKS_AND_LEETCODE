import java.util.HashMap;

public class fracton_with_sum_1 {
	static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public static int countFractions(int n, int[] nu, int[] de) { 
       int [][]ans=new int [n][2];
       for(int i=0;i<n;i++){
           int g=gcd(nu[i],de[i]);
           ans[i][0]=nu[i]/g;
           ans[i][1]=de[i]/g;
       }
       HashMap<String,Integer>map=new HashMap<>();int c=0;
      for(int i=0;i<n;i++){
          int a=ans[i][1]-ans[i][0];
          int b=ans[i][1];
          String x=a+"-"+b;
          if(map.containsKey(x)){
              c+=map.get(x);
          }
          String y=ans[i][0]+"-"+ans[i][1];
          map.put(y,map.getOrDefault(y,0)+1);
    }
    return c;
}
}
