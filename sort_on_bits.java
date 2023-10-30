import java.util.Arrays;

public class sort_on_bits {
	public int[] sortByBit(int[] arr) {
		
		 Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		 Arrays.sort(boxedArray,(a,b)->{
			 int ac=Integer.bitCount(a);
			 int bc=Integer.bitCount(b);
			 return ac==bc?a-b:ac-bc;
		 });
		 
		 
		 return Arrays.stream(boxedArray).mapToInt(Integer::intValue).toArray();
	}
	public int[] sortByBits(int[] arr) {
		int res[]=new int [arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i]=Integer.bitCount(arr[i])*10001+arr[i];
		}
		Arrays.sort(res);
		for(int i=0;i<res.length;i++) {
			res[i]%=10001;
		}
		return res;
	}
	
}
