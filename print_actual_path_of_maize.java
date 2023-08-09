import java.util.ArrayList;

public class print_actual_path_of_maize {
	static void path( String a ,int r,int c) {
		if(r==1&&c==1) {
			System.out.println(a);
			return ;
		}
		if(r>1) path(a+"D",r-1,c);
		if(c>1) path(a+"R",r,c-1);
	}
	static ArrayList<String>ret(String a ,int r,int c){
		if(r==1&&c==1) {
			ArrayList<String>list=new ArrayList<>();
			list.add(a);
			return list;
		}
		ArrayList<String>list=new ArrayList<>();
		if(r>1)list.addAll(ret(a+"D",r-1,c));
		if(c>1)list.addAll(ret(a+"R",r,c-1));
		return list;
	}
	static ArrayList<String>digonally(String a ,int r,int c){
		if(r==1&&c==1) {
			ArrayList<String>list=new ArrayList<>();
			list.add(a);
			return list;
		}
		ArrayList<String>list=new ArrayList<>();
		if(r>1&&c>1) list.addAll(digonally(a+"D",r-1,c-1));
		if(r>1)list.addAll(digonally(a+"V",r-1,c));
		if(c>1)list.addAll(digonally(a+"H",r,c-1));
		return list;
	}
	public static void main(String[] args) {
		path("",3,3);
		System.out.println(ret("",3,3));
		System.out.println(digonally("",3,3));
	}
}
