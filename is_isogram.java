
public class is_isogram {
	static boolean isIsogram(String data){
        //Your code here
		if(data.length()==0) {
			return true;
		}
		int c=0;
		for(int i=0;i<data.length();i++) {
			char f=data.charAt(i);
			if(data.lastIndexOf(f)==data.indexOf(f)) {
				c++;
			}else {
				break;
			}
		}
		if(data.length()==c) {
			return true;
		}
		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
