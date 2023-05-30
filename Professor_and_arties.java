import java.util.Arrays;

public class Professor_and_arties {
	public static String PartyType( long a[], int n)
    {Arrays.sort(a);
    for (int i=0;i<n-1;i++) {
    	if(a[i]==a[i+1]) {
    		return "BOYS";
    	}
    }return "GIRLS";
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
