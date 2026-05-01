public class linear {
     public static void main(String[] args) {
        int a[] = {1, 3, 5, 7};
        int key = 5;

        for (int i : a) {
            if (i == key) {
                System.out.println("Found");
                return;
            }
        }

        System.out.println("Not Found");
    }
}
