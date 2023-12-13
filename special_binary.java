
public class special_binary {
	 public int numSpecial(int[][] mat) {
	        int sp=0;
	        for(int row[]:mat){
	            if(rowsum(row)==1){
	                int cidx=colidx(row);
	                sp+=(colsum(mat,cidx)==1)?1:0;
	            }
	        }
	        return sp;
	    }
	    int rowsum (int r[]){
	        int s=0;
	        for(int e:r){
	            s+=e;
	        }
	        return s;
	    }
	    int colidx(int r[]){
	        for(int e=0;e<r.length;e++){
	            if(r[e]==1)return e;
	        }
	        return -1;
	    }
	    int colsum(int mat[][],int i){
	        int s=0;
	        for(int r[]:mat ){
	            s+=r[i];
	        }
	        return s;
	    }
}
