import java.util.ArrayList;
import java.util.List;

public class subsetWithDublicate {
	static List<List<Integer>>subset(int a[]){
		List<List<Integer>>outer=new ArrayList<>();
		outer.add(new ArrayList<>());
		int start,end=0;
		for(int i=0;i<a.length;i++) {
			start=0;
			if(i>0&&a[i]==a[i-1])
				start=end+1;
			end=outer.size()-1;
			int n=outer.size();
			for(int j=start;j<n;j++) {
				List<Integer>internal=new ArrayList<>(outer.get(j));
				internal.add(a[i]);
				outer .add(internal);
			}
		}
		return outer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]= {1,2,2};
	List<List<Integer>>l=subset(a);
	for(List<Integer>ll:l) {
		System.out.println(ll);
	}
	}
}
