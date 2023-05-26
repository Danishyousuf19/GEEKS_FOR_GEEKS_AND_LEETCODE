import java.util.Arrays;

public class third_largest {
static 	int thirdLargest(int a[], int n)
    {Arrays.sort(a);
	   if(a.length<=2){
	       return -1;
	   }
	   return a[n-3];
	   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[]= {2,2,2,2,1,4,5,8};
		System.out.println(thirdLargest(s,8));
	}

}
