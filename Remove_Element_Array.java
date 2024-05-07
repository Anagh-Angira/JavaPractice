
public class Remove_Element_Array {
    static void removeElement(int[] arr, int ele) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ele) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                c = c + 1;
                break;
            }
        }
        if (c == 0) {
            System.out.println("Element not deleted ");
        } else {
            System.out.println("Element delete successfully");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = { 2, 8, 9, 10, 12, 150 };
        removeElement(a, 8);

    }

}
