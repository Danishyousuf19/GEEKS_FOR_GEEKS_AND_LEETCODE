import java.util.Arrays;
import java.util.*;

public class bitterString {
	public static String betterString(String str1, String str2) {
        //
        // Count distinct subsequences for each string
        int count1 = countDistinctSubsequences(str1);
        int count2 = countDistinctSubsequences(str2);

        // Compare counts and return the better string
        return (count1 >= count2) ? str1 : str2;
    }

    // Method to count distinct subsequences using dynamic programming
    private static int countDistinctSubsequences(String str) {
        int MOD = 1000000007;
        int n = str.length();
        
        // Array to store the last occurrence index of each character
        int[] lastOccurrence = new int[256];
        Arrays.fill(lastOccurrence, -1);

        // Dynamic programming array to store count of distinct subsequences
        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: empty string has one subsequence

        // Iterate through each character of the string
        for (int i = 1; i <= n; i++) {
            // Calculate count based on the recurrence relation
            dp[i] = (2 * dp[i - 1]) % MOD;

            // Subtract count of subsequences ending at the last occurrence of the current character
            if (lastOccurrence[str.charAt(i - 1)] != -1) {
                dp[i] = (dp[i] - dp[lastOccurrence[str.charAt(i - 1)] - 1] + MOD) % MOD;
            }

            // Update last occurrence index of the current character
            lastOccurrence[str.charAt(i - 1)] = i;
        }

        // Return the final count of distinct subsequences
        return dp[n];
    }
  
    class SubsequenceCount 
    {
     
      // Returns count of distinct 
      // subsequences of str. 
      public static int countSub(String s) 
      {
        HashMap<Character,
                 Integer> map = new HashMap<Character,
                                            Integer>();
     
        // Iterate from 0 to s.length()
        for(int i = 0; i < s.length(); i++) 
        {
          map.put(s.charAt(i), -1);
        }
         
        int allCount = 0;
        int levelCount = 0;
         
        // Iterate from 0 to s.length()
        for(int i=0;i<s.length();i++) 
        {
          char c = s.charAt(i);
           
          // Check if i equal to 0
          if(i==0) 
          {
            allCount = 1;
            map.put(c,1);
            levelCount = 1;
            continue;
          }
           
          // Replace levelCount with
          // allCount + 1
          levelCount = allCount + 1;
           
          // If map is less than 0
          if(map.get(c)<0) 
          {
            allCount = allCount + levelCount;
          }
          else
          {
            allCount = allCount + levelCount - map.get(c);
          }
          map.put(c,levelCount);
        }
         
        // Return answer
        return allCount;
     
      }
       
      // Driver Code
      public static void main(String[] args) 
      {
        List<String> list = Arrays.asList("abab","gfg");
         
        for(String s : list)
        {
          int cnt = countSub(s);
          int withEmptyString = cnt+1;
          System.out.println("With empty string count for " +
                             s +" is " + withEmptyString);
          System.out.println("Without empty string count for " +
                             s + " is " + cnt);
        }
      }
    }
}
