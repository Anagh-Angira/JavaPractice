public class SearchAlgo {

    static void linearSearch(int[] a, int ele) {

        int temp = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == ele) {
                System.out.println("Element Present at " + i + " Position");
                temp = temp + 1;
            }
        }

        if (temp == 0) {
            System.out.println("Element not found..");
        }

    }

    static void binarySearch(int[] a, int l, int r, int item) {

        boolean flag = false;

        while (l <= r) {

            int m = l + (r - l) / 2;

            if (a[m] == item) {
                System.out.println("Present at " + m + " Position.");
                flag = true;
                return;
            } else if (a[m] > item)
                r = m - 1;

            else
                l = m + 1;

        }
        if (flag == false) {
            System.out.println("Not Found Element.");
        }
    }

    public static void main(String[] args) {
        // int[] a = { 1, 2, 8, 7, 5, 12 };
        // linearSearch(a, 12);

        int[] a = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        binarySearch(a, 0, a.length - 1, 500);

    }
}
