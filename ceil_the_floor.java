import java.util.ArrayList;

public class ceil_the_floor{
	class Pair{
		int floor,ceil;
		Pair(){
			this.floor=0;
			this.ceil=0;
			
		}
		Pair(int f,int c){
			floor=f;
			ceil=c;
		}
	}
	
		 Pair getFloorAndCeil(int[] arr, int n, int x) {
			    int floor=Integer.MIN_VALUE;
					 int ceil=Integer.MAX_VALUE;
					 for(int i:arr) {
						 if(i<=x)floor=Math.max(i, floor);
						 if(i>=x) ceil=Math.min(i, ceil);
					 }
					 if(floor==Integer.MIN_VALUE) return new Pair(-1,ceil);
						
				     if(ceil==Integer.MAX_VALUE) return new Pair(floor,-1);
					
				     return new Pair(floor,ceil);
				       
				    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
