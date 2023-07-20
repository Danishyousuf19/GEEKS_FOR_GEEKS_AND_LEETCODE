import java.util.Arrays;

public class sort_array_of_120 {
	public static void sort012(int a[], int n)
    { int high=n-1;
    int low =0;
    int mid=0;
    int temp;
    while(mid<=high) {
    	switch(a[mid]) {
    	case 0:{
    		 temp = a[low];
             a[low] = a[mid];
             a[mid] = temp;
             low++;
             mid++;
             break;
    	}
    	case 1:{
    		mid++;
    		break;
    	}
    	case 2:{
    		 temp=a[mid];
    		a[mid]=a[high];
    		a[high]=temp;
    		high--;
    		break;
    	}
    	
    	}
    }
    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {0,2,1,2,0};
sort012(arr,5);
System.out.println(Arrays.toString(arr));

	}

}
