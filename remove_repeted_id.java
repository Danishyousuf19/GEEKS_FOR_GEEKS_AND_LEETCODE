import java.util.ArrayList;

public class remove_repeted_id {
	public int[] uniqueId(long arr[], long n)
    {
		ArrayList<Integer>list=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(list.contains(arr[i])) {
				continue;
			}
			list.add((int) arr[i]);
		}
		
       int a[]=new int [list.size()];
       
       int i=0;
       for(int e: list) {
    	   a[i++]=e;
       }
       return a;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
