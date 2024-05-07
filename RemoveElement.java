
public class RemoveElement {

    static void removeElement(int[] a, int index) {
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                a[i] = 0;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void removeElement1(int[] a, int ele) {

        int c = 0;
        for (int i = 0; i < a.length; i++) {

            if (ele == a[i]) {
                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];

                }
                c = c + 1;
                break;
            }
        }
        if (c == 0) {
            System.out.println("Element not Found");
        } else {
            System.out.println("Element Removed Successfully");
            for (int i = 0; i < a.length - 1; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 2, 8, 9, 10, 12, 150 };
        // removeElement(a, a.length - 1);
        removeElement1(a, 1500);
    }

}
