import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        int num;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number to convert decimal to hexadecimal: ");
            num = sc.nextInt();
        }
        System.out.println(convertToBase16(num));
    }

    public static String convertToBase16(int num) {
        return Integer.toHexString(num);
    }
}