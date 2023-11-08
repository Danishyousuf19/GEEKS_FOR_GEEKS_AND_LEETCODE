
public class cell_reachable {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
    	int min=Math.max(Math.abs(sy-fy), Math.abs(sx-fx));
    	if(min==0)
    	return t!=1;
        return t>=min;
    }
}
