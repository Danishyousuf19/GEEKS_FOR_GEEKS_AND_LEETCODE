import java.util.Arrays;

public class rec_linear_search {
//	Recursion in array
static int rec(int a[],int i,int t) {
	if(i==a.length) {
		return -1;
	}
	if(a[i]==t)
		return i;
	return rec(a,i+1,t);
}
// recursion in string 

static int rec1(String a,char c,int i) {
	if(i==a.length())
		return -1;
	if(a.charAt(i)==c)
        return i;
        return rec1(a,c,i+1);

}
// search in range
static int rec2(int a[],int i,int j,int t) {
	
	if(i==j) 
		return -1;
	if(a[i]==t)
		return i;
	return rec2(a,i+1,j,t);
	
}
// find minimum
static int min=Integer.MAX_VALUE;
static int rec3(int a[],int i) {
	if(i==a.length)
		return min;
	if(a[i]<min)
		min=a[i];
	return rec3(a,i+1);
				
}
// search in 2d array
static int[] rec4(int a[][],int i,int j,int t) {
	
	if(i==a.length||j==a[0].length)
		return null;
	if(a[i][j]==t)
		return new int[] {i,j};
	int result[]=rec4(a,i,j+1,t);
	if(result==null) {
		result=rec4(a,i+1,j,t);
	}
	return result;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,-3,4,4};
System.out.println(rec(a,0,14));
   String x="danish";
   System.out.println(rec1(x,'r',0));
   System.out.println(rec2(a,2,4,4));
   System.out.println(rec3(a,0));
   
   int res[][]= {{1,2,-3,244,4},{1,2,-3,24,4}};
   System.out.println(Arrays.toString(rec4(res,0,0,24)));
	}

}
