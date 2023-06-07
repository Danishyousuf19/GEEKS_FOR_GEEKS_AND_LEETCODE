import java.util.Scanner;

public class data_type {
	static int dataTypeSize(String str) {
	 if(str.equals("Integer")) {
			return 4;
		}
	else if(str.equals("Character")) {
		return 1;
	}
	else if(str.equals("Float")) {
		return 4 ;
	}
	else if(str.equals("Long")) {
		return 8;
	}
	else {
return 8;
	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated met
		Scanner sc = new Scanner(System.in);
		try {
		 long x=sc.nextLong();
         System.out.println(x+" can be fitted in:");
         if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)
             System.out.println("* byte");
         if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
             System.out.println("* short");
         if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
             System.out.println("* int");
         if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
             System.out.println("* long");
     }
     catch(Exception e){
         System.out.println(sc.next()+" can't be fitted anywhere.");
     }
	}
	
}
