interface Test {
    void display();
}

class P15 implements Test {
    public void display() { System.out.println("Interface"); }

    public static void main(String[] args) {
        new P15().display();
    }
}
