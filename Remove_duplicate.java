import java.util.ArrayList;

public class Remove_duplicate {
	static  int remove_duplicate(int A[],int N){
	        ArrayList <Integer> list=new ArrayList<>();
	        for (int e:A) {
	        	if(!list.contains(e)) {
	        		list.add(e);
	        		System.out.print(" "+e+" ");
	        	}
	        }
	        return list.size()
	        		  ;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,3,4,2,2,5,6};
System.out.println("\n"+remove_duplicate(a,9));
	}

}
