import java.util.ArrayList;

public class keypad_combination {
static void pad(String p ,String up) {
	if(up.length()==0)
	{
		System.out.println(p);
		return;
	}
	int dig=up.charAt(0)-'0';
	for(int i=((dig-1)*3);i<(dig*3);i++) {
		char ch=(char)('a'+i);
		pad(p+ch,up.substring(1));
	}
}

static ArrayList<String> ret(String p,String up){
	if(up.isEmpty()) {
		ArrayList<String>list=new ArrayList<>();
		list.add(p);
		return list;
	}
	ArrayList<String>list=new ArrayList<>();
	int dig=up.codePointAt(0)-'0';
	for(int i=(dig-1)*3;i<dig*3;i++) {
		char ch=up.charAt(0);
		list.addAll(ret(p+ch,up.substring(1)));
	}
	return list;
}
static int count(String p ,String up) {
	if(up.length()==0)
	{
		
		return 1;
	}
	int c=0;
	int dig=up.charAt(0)-'0';
	for(int i=((dig-1)*3);i<(dig*3);i++) {
		char ch=(char)('a'+i);
		c=c+count(p+ch,up.substring(1));
	}
	return c;
}
}
