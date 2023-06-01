
public class array_oppertion {
	
public boolean searchEle(int a[],int x)
   {
	for (int i=0;i<a.length;i++){
	    if(a[i]==x)
	    return true;
	}
	return false;
}
public boolean insertEle(int a[],int y,int yi)
    {if(yi<a.length){
        a[yi]=y;
        return true;
    }return false;
          //add code here.		
}
public boolean deleteEle(int a[],int z)
    {
        for(int i=0;i<a.length;i++){
            if(a[i]==z){
                a[i]=0;return true;
            }
           
        } 
       
        return true;
	//add code here.
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
