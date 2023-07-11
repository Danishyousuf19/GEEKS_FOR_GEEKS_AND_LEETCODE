import java.util.Stack;

public class find_kth_in_spiral_matrix {
	int findK(int a[][], int n, int m, int k)
    {
		int rl=0,ru=n-1,cl=0,cu=m-1;
		int count=0;
		while(count!=n*m) {
			for(int i=cl;i<=cu;i++) {
				count++;
				if(count==k)
					return a[rl][i];
			}
			rl++;
			for(int i=rl;i<=ru;i++) {
				count++;
				if(count==k)
					return a[i][cu];
			}
			cu--;
			for(int i=cu;i>=cl;i--) {
				count++;
				if(count==k)
					return a[ru][i];
			}
			ru--;
			for(int i=ru;i>=rl;i--) {
				count++;
				if(count==k)
					return a[i][cl];
			}
			cl++;
		}
	
		return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	}
