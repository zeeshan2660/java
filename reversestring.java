public class reversestring {
    public static void main(String[] args) {
        String s = "hello";
        String rev = new StringBuilder(s).reverse().toString();

        System.out.println(rev);
    }
}
