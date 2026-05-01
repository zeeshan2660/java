public class inheritence {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends inheritence {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
