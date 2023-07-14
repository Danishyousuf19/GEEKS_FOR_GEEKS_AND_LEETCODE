
public class spiral_matrix_2d {
public int[][] generateMatrix(int n) {
	int x=0;
        int arr[][]=new int [n][n];
        int rl=0,cl=0,cu=n-1,ru=n-1;
        while(rl<=ru&&cl<=cu) {
        	for(int i=cl;i<=cu;i++) {
        		arr[rl][i]=x;
        		x++;
        	}
        	rl++;
        	for(int i=rl;i<=ru;i++) {
        		arr[i][cu]=x;
        		x++;
        	}
        	cu--;
        	if(rl<=ru) {
        	for(int i=cu;i>=cl;i--) {
        		arr[ru][i]=x;
        		x++;
        	}
        	ru--;}
        	if(cl<=cu) {
        	for(int i=ru;i>=rl;i--) {
        		arr[i][cl]=x;
        		x++;
        	}
        	cl++;
        	}
        }
        
        return arr;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
