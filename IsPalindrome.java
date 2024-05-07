public class IsPalindrome {

    static void isPalindrome(int x) {

        if (x < 0) {
            System.out.println("Element is not Palindrome");
        }

        int num = x;
        int res = 0;
        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            res = res * 10 + rem;
        }

        if (x == res)
            System.out.println("Element is Palindrome");
        else
            System.out.println("Element is Not Palindrome");
    }

    public static void main(String[] args) {
        int x = 1211;
        isPalindrome(x);
    }

}
