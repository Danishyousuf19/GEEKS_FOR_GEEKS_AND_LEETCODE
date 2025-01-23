public class Permutations {

    public static void main(String[] args) {
        String a = "dog";
        generate(a, "");
    }

    private static void generate(String a, String r) {
        if (a.length() == 0) {
            System.out.println(r);
            return;
        }
        for (int i = 0; i < a.length(); i++) {
            char n = a.charAt(i);
            String remaining = a.substring(0, i) + a.substring(i + 1);
            generate(remaining, r + n);
        }
    }
}
