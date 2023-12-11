
public class more_than_25Per {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
int q=n/4;
for(int i=0;i<n-q;i++){
    if(arr[i]==arr[q+i])return arr[i];

}return -1;
    }

}
