// package JAVA;

public class AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        char carry = '0';
        while (i >= 0 || j >= 0) {
            char bitA = (i >= 0) ? a.charAt(i) : '0';
            char bitB = (j >= 0) ? b.charAt(j) : '0';
            if (bitA=='0' && bitB=='0' && carry=='0') {
                sb.append('0');
                carry = '0';
            }
            else if ((bitA=='1' && bitB=='0' && carry=='0') || (bitA=='0' && bitB=='1' && carry=='0') || (bitA=='0' && bitB=='0' && carry=='1')) {
                sb.append('1');
                carry = '0';
            }
            else if ((bitA=='1' && bitB=='1' && carry=='0') || (bitA=='1' && bitB=='0' && carry=='1') || (bitA=='0' && bitB=='1' && carry=='1')) {
                sb.append('0');
                carry = '1';
            }
            else {
                sb.append('1');
                carry = '1';
            }
            i--;
            j--;
        }
        if (carry == '1') {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
    
    public static void main(String[] args) {
        String a = "1011101";
        String b = "1110101101111";
        System.out.println(addBinary(a, b));
    }
}