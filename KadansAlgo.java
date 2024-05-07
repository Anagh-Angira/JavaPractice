public class KadansAlgo {
    static int largestSum(int[] a) {
        int n = a.length;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += a[k];
                }
                if (sum > max_sum) {
                    max_sum = sum;
                }
            }
        }
        return max_sum;
    }

    static int kadensAlgo(int[] a) {
        int sum = 0;
        int maxi = a[0];
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];

            maxi = Math.max(maxi, sum);
            if (sum < 0)
                sum = 0;
        }

        return maxi;
    }

    public static void main(String[] args) {
        int[] a = { 5, 4, -1, 7, 8 };
        System.out.println(largestSum(a));
        System.out.println(kadensAlgo(a));
    }

}
