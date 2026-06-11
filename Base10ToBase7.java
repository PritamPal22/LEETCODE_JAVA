// package JAVA;
public class Base10ToBase7 {
    public static void main(String[] args) {
        int num = -1256;

        System.out.println(convertToBase7(num));
    }

    public static String convertToBase7(int num) {
        String S = Integer.toString(num,7);      
        return S;
    }
    
    // public static String convertToBase7(int num) {
    //     // int n = (int)Math.log10(num);
    //     boolean isNegative = num < 0;
    //     num = Math.abs(num);
    //     if(num == 0) return "0";
    //     StringBuilder sb = new StringBuilder();
    //     while(num > 0) {
    //         int rem = num % 7;
    //         sb.append(rem);
    //         num /= 7;
    //     }
    //     if (isNegative) {
    //     sb.append('-');
    //     }
    //     return sb.reverse().toString();
    // }
}