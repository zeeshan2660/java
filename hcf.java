public class hcf {
    public static void main(String[] args) {
        int a = 12, b = 18;

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        System.out.println("GCD = " + a);
    }
}
