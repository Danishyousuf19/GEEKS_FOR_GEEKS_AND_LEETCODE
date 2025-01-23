import java.util.Arrays;

public class remove_duplicated_insorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2,3,4,4,5,5,6,6,6,7};
		int a=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=ar[a]) {
				a++;
				ar[a]=ar[i];
			}
		}
		int b[]=Arrays.copyOf(ar, a+1);
System.out.print(Arrays.toString(b));

	}

}
