
public class solve_soduko {
	static boolean issafe(int b[][],int r,int c,int n){
        for(int i=0;i<9;i++){
            if(b[i][c]==n)return false;
            if(b[r][i]==n)return false;
        }
        int sc=(c/3)*3;
        int sr=(r/3)*3;
        
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(b[i][j]==n) return false;
            }
        }
        return true;
    }
    static boolean helper(int b[][],int r,int c){
        if(r==9)return true;
        int nr=0;int nc=0;
        if(c!=8){
            nr=r;
            nc=c+1;
        }
        else{
            nr=r+1;
            nc=0;
        }
        if(b[r][c]!=0){
            if(helper(b,nr,nc)){
                return true;
            }
        }
        else{
            for(int i=1;i<=9;i++){
                    if(issafe(b,r,c,i)){
                        b[r][c]=i;
                        if(helper(b,nr,nc)){
                            return true;
                        }
                    else {
                        b[r][c]=0;
                      }
                    }
                }
        }
        return  false;
    }
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int g[][])
    {
      return helper(g,0,0);
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(grid[i][j]+" ");
            }
            //  System.out.println();
        }
    }
}
