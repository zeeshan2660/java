public class methodoverloading {
    void add(int a, int b) { System.out.println(a + b); }
    void add(int a, int b, int c) { System.out.println(a + b + c); }

    public static void main(String[] args) {
    methodoverloading o = new methodoverloading();
        o.add(2, 3);
        o.add(1, 2, 3);
    }
}
