import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//You don't need to read input or print anything. Your task is to complete 
//the function count() which takes the string S as input and returns an array 
//of size 4 where arr[0] = number of uppercase characters, arr[1] = number of lowercase
//characters, arr[2] = number of numeric characters and arr[3] = number of special characters.
public class count_character_type {
static 	int[] count (String s)
    {
        int a[]=new int [4];
        for (int i=0;i<s.length();i++) {
        	char current =s.charAt(i);
        	if(Character.isDigit(current)) {
        		a[2]++;
        	}
        	else if(Character.isUpperCase(current)) {
        		a[0]++;
        	}
        	else if(Character.isLowerCase(current)) {
        		a[1]++;
        	}
        	else if(!Character.isWhitespace(current)) {
        		a[3]++;
        	}
        }
        return a;
    }
	public static void main(String[] args) {
		int x[]=count("*GeEkS4GeEkS*");
//		System.out.println(Arrays.toString(x));
		count_unique();

	}
	static void count_unique() {
		int arr[]= {1,2,3,4,5,5,4};
		int c=0;
		Set<Integer>set=new HashSet<>();
		for(int i :arr) {
			if(!set.contains(i)) {
				set.add(i);
				c++;
			}
			else {
				c--;
			}
		}
		System.out.println(c);
		
	}

}
