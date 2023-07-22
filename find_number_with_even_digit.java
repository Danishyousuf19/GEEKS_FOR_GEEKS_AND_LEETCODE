
public class find_number_with_even_digit {
	static int c=0;
	static int i;
public static int findNumbers1(int[] nums) {
	if(i==nums.length)
        return c;
	int digit=(int) (Math.log10(nums[i])+1);
	if(digit%2==0)
		c=c+1;
	i=i+1;
	return findNumbers1(nums);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {22,33,4,233};
System.out.println(findNumbers1(a));
	}
	public  int findNumbers(int[] nums) {
		int c=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<0)
				nums[i]*=-1;
			if(even(nums[i]))
				c++;
		}
		return c;
	}
	static boolean even(int n) {
		int d=0;
		while(n>0) {
			d++;
			n/=10;
		}
		return d%2==0;
	}
}
