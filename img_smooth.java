
public class img_smooth {
	 public int[][] imageSmoother(int[][] img) {
	        int res[][]=new int [img.length][img[0].length];
	        for(int i=0;i<img.length;i++){
	            for(int j=0;j<img[0].length;j++){
	                res[i][j]=smoother(img,i,j);
	            }
	        }
	        return res;
	    }
	    int smoother(int img[][],int i,int j){
	        int m = img.length; 
	        int n = img[0].length;
	        int sum=0,c=0;
	        for(int x=i-1;x<=i+1;x++){
	            for(int y=j-1;y<=j+1;y++){
	                if(x<0||x>=m||y<0||y>=n)continue;
	                sum+=img[x][y];
	                c++;
	            }
	        }
	        return sum/c;
	    }
}
