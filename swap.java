class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Swapping without using third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
