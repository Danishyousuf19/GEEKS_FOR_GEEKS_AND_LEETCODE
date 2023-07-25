import java.util.*;

public class list_hackerrank {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            list.add(x);
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            String qur=sc.next();
            if(qur.equals("Insert")){
                int x=sc.nextInt();
                int y=sc.nextInt();
                list.add(x,y);
            }
            else{
                int x=sc.nextInt();
                list.remove(x);
            }
        }
        for(int a:list) {
        	System.out.println(a);
        }
    }
}
