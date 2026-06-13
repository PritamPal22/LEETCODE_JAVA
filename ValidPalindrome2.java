public class ValidPalindrome2 {
    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        int count = 0;

        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                count++;
                if (count > 1) return false;

                // try skipping either left or right character
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abddba";
        System.out.println(validPalindrome(s));
    }
}