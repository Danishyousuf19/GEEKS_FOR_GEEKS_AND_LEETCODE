
public class maixze_no_restriction {
	static void path( String a , boolean maze[][],int r,int c) {
		if(r==maze.length-1&&c==maze[0].length-1) {
			System.out.println(a);
			return ;
		}
		
		if(!maze[r][c]) return;
		if(r<maze.length-1) path(a+"D",maze,r+1,c);
		if(c<maze[0].length-1) path(a+"R",maze,r,c+1);
		if(r>0) path(a+"U",maze,r-1,c);
		if(c>0) path(a+"U",maze,r,c-1);
	}
}
//stack over flow