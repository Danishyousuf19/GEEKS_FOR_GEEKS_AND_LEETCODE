
public class maixe_with_obsticle {
	static void path( String a , boolean maze[][],int r,int c) {
		if(r==maze.length-1&&c==maze[0].length-1) {
			System.out.println(a);
			return ;
		}
		if(!maze[r][c]) return;
		if(r<maze.length-1) path(a+"D",maze,r+1,c);
		if(c<maze[0].length-1) path(a+"R",maze,r,c+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
