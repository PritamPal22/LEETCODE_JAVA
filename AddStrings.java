// package JAVA;

public class AddStrings {
    public static String addStrings(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int bitA = (i >= 0) ? (a.charAt(i) - '0') : 0;
            int bitB = (j >= 0) ? (b.charAt(j) - '0') : 0;
            // System.out.println(bitA +"  "+ bitB);
            int sum = bitA + bitB + carry;
            if(sum > 9) {
                // int rem = sum % 10;
                // System.out.println(rem);
                sb.append(Integer.toString(sum % 10));
                carry = 1;
            } else {
                sb.append(sum);
                carry = 0;
            }
            i--;
            j--;
        }
        if (carry == 1) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
    
    public static void main(String[] args) {
        String a = "99";
        String b = "1";
        System.out.println(addStrings(a, b));
    }
    
}
