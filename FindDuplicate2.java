import java.util.HashSet;
import java.util.Set;

public class FindDuplicate2 {

    static void findDuplicate2(int[] a) {
        Set<Integer> set = new HashSet<>();

        for (Integer num : a) {
            boolean b = set.add(num);
            if (b == false) {
                System.out.print(num + " ");
            }
        }

    }

    

    public static void main(String[] args) {
        int[] a = { 3, 5, 4, 3, 2, 2, 1, 7, 1, 4, 4 };
        findDuplicate2(a);
    }
}
