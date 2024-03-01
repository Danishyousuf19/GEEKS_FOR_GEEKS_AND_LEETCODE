
public class peak_ele {
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int i=0;
       int j=n-1;
       while(i<j){
           int m=(i+j)/2;
           if(arr[m]<arr[m+1]){
               i=m+1;
           }
           else{
               j=m;
           }
       }
       return i;}
}
