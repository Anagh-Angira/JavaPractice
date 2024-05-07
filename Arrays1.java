class Arrays1 {
    static void mereSortedArray(int[] a, int[] b, int i, int j, int k) {
        int[] res = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                res[k] = a[i];
                k++;
                i++;
            } else {

                res[k] = b[j];
                k++;
                j++;
            }
        }

        while (i < a.length) {
            res[k] = a[i];
            k++;
            i++;
        }
        while (j < b.length) {
            res[k] = b[j];
            k++;
            j++;
        }

        for (int l = 0; l < res.length; l++) {
            System.out.print(res[l] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 5, 7, 10,15,18,99 };
        int[] b = { 2, 6, 8, 12,16,19 };
        System.out.println("Sorted Array Is : ");
        mereSortedArray(a, b, 0, 0, 0);
    }
}