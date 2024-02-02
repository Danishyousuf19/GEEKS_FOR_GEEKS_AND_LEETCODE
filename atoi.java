
public class atoi {
	int atoi(String s) 
    {
        boolean isneg = false;
        if(Character.isDigit(s.charAt(s.length()-1)) == false )
        {
            return -1;
        }
        if(s.charAt(0)=='-')
        {
            isneg = true;
        }
        int rem =0;
        int ans = 0;
       for(int i =0;i<s.length();i++)
       {
           if(i == 0 && isneg == true)
           {
               continue;
           }
           if(Character.isAlphabetic(s.charAt(i)))
           {
               return -1;
           }
           else
           {
               rem = s.charAt(i)-'0';
               ans = ans*10+rem;
           }
           
       }
       if(isneg == true)
       {
           return ans-(2*ans);
       }
       return ans;
    }
}
