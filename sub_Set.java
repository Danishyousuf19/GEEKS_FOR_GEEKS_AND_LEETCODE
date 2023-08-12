import java.util.*;
public class sub_Set {
static List<List<Integer>>subset(int a[]){
	List<List<Integer>>outer=new ArrayList<>();
	outer.add(new ArrayList<>());
	for(int num:a) {
		int n=outer.size();
		for(int i=0;i<n;i++) {
			List<Integer>internal=new ArrayList<>(outer.get(i));
			internal.add(num);
			outer .add(internal);
		}
	}
	return outer;
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
int a[]= {1,2,3};
List<List<Integer>>l=subset(a);
for(List<Integer>ll:l) {
	System.out.println(ll);
}
}
}
