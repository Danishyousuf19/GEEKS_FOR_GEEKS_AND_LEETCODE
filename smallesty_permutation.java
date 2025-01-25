import java.util.Arrays;

public class smallesty_permutation {
    public static void main(String[] args) {
        Long a = 12301L;
        char[] ar = a.toString().toCharArray();
        Arrays.sort(ar);
        int i = 0;
        
        // Skip leading zeros
        while (i < ar.length && ar[i] == '0') {
            i++;
        }
        
        // Swap the first non-zero digit with the first digit
        if (i < ar.length) {
            char t = ar[i];
            ar[i] = ar[0];
            ar[0] = t;
        }
        
        System.out.println(ar);
    }
}
