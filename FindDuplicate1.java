public class FindDuplicate1 {
    static void findDuplicate(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] == a[j]) && (i != j)) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 3, 5, 4, 3, 2, 2, 1, 7, 1, 4 };
        findDuplicate(a);
    }
}
