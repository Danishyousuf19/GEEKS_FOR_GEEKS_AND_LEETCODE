
public class print_1_n$$n_1 {
	static public void printNos(int N)
    {
		if(N==0) {
			return ;
		}
		System.out.print(N+" ");
    printNos(N-1);
    }
	public static void main(String[] args) {
		printNos(6);
		System.out.println();
		printNos2(6);

	}
	  
   static public void printNo2(int N,int s){
        if(s>N) {
        	return ;
        }
        System.out.print(s+" ");
       printNo2(N,s+1);
        
    }
  public static void printNos2(int N)
    {
    printNo2(N,1);
    }
}
//6 5 4 3 2 1 
//1 2 3 4 5 6 