public class binary {
     public static void main(String[] args) {
        int a[] = {1, 3, 5, 7};
        int key = 5, l = 0, h = a.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (a[mid] == key) {
                System.out.println("Found");
                return;
            } else if (a[mid] < key) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        System.out.println("Not Found");
    }
}
