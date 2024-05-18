import java.util.Arrays;

public class AddToArray {
    public static void main(String[] args) {
        int arr[] = { 9, 4, 4 };
        int c = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] += (1 + c);
            c = arr[i] / 10;
            arr[i] %= 10;
        }
        if (c > 0) {
            int[] brr = new int[arr.length + 1];
            brr[0] = c;
            for (int i = 1; i <= arr.length; i++) {
                brr[i] = arr[i - 1];
            }
            System.out.println(Arrays.toString(brr));
        } else {
            System.out.println(Arrays.toString(arr));
        }
    }
}
