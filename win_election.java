import java.util.HashMap;

public class win_election {
	 public static String[] winner(String arr[], int n)
	    {
	        // add your code
	        String res[]=new String[2];
	        int max=0;
	        HashMap<String,Integer>map=new HashMap<>();
	        for(int i=0;i<n;i++){
	            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	            max=Math.max(max,map.get(arr[i]));
	        }
	        for(String s:map.keySet()){
	            if(map.get(s)==max){
	                if(res[0]==null)res[0]=s;
	                else if(res[0].compareTo(s)>0)res[0]=s;
	            }
	        }
	        res[1]=String.valueOf(max);
	        return res;}
}
