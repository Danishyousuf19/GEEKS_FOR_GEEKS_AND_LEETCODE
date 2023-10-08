import java.util.*;

public class generate_parenthesis {
public List<String> generateParenthesis(int n) {
	 List<String>res=new ArrayList<>();
     find(res,0,0,"",n);
     return res ;
    }
static void find(List<String> res,int l,int r,String s,int n) {
	if(s.length()==n*2) {
		res.add(s);
		return ;
	}
	if(l<n)find(res,l+1,r,s+"(",n);
	if(l>r)find(res,l,r+1,s+")",n);
}
}
