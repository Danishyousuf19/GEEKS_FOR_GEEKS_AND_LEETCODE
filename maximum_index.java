
public class maximum_index {
	static int  maxIndexDiff(int arr[], int n) {
	        int max =0;
	        int i=0,j=n-1;
	        while(i<j) {
	        	int x=j-i;
	        	if(arr[i]<=arr[j]) {
	        		max=Math.max(max, x);
	        	
	        	i++;
	        	j=n-1;  
	        	}
	        	else   {
        			j--;
        		}
	        }
	        return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int aa[]= {47, 46 ,14, 1, 29, 44, 19, 30, 48, 47, 17, 36, 41, 44};
int a1a[]= {35 ,1, 48, 22, 24, 23, 39, 20, 45, 12, 35};

System.out.println(maxIndexDiff(a1a,11));

System.out.println(maxIndexDiff(aa,14));
int []ne= {18,17};
System.out.println(maxIndexDiff(ne,2));
	}

}
