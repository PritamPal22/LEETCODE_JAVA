public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String Palindrome = "";
        for(int i=0;i<s.length();i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) Palindrome = Palindrome + Character.toLowerCase(s.charAt(i));
            
        }
        System.out.println(Palindrome);
        int n = Palindrome.length()-1;
        System.out.println(n);
        
        int j=n;
        for(int i=0;i<=n/2;i++,j--) {
            System.out.println(Palindrome.charAt(i) +"  "+ Palindrome.charAt(j));
            if(Palindrome.charAt(i) != Palindrome.charAt(j)) return false;
        }
        return true;
        /*String reversed = new StringBuilder(Palindrome).reverse().toString();
        System.out.println(Palindrome);
        return Palindrome.equals(reversed);*/
        
    }
    public static void main(String[] args) {
        String s = "race Aa 0 ecar";

        System.out.println(isPalindrome(s));
    }
}
