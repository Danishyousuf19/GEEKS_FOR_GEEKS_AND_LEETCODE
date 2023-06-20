
public class fold_carpet {
	int carpetBox(int A, int B, int C, int D) { 
       int norotation=0;
       int rotation=0;
       int tl=A;
       int tb=B;
       while(A>C) {
    	   A/=2;
    	   norotation++;
       }
       while(B>D) {
    	   B/=2;
    	   norotation++;
       }
       //rotate
       A=tb;
       B=tl;
       while(A>C) {
    	   A/=2;
    	   rotation++;
       }
       while(B>D) {
    	   B/=2;
    	   rotation++;
       }
       return Math.min(rotation, norotation);
    		   
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
