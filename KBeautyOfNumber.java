import java.util.Scanner;

public interface KBeautyOfNumber {
    
    public static int Count(int num, int k) {
        String s = String.valueOf(num);
        int count = 0;
        for (int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            int divisor = Integer.parseInt(sub);
            if (divisor != 0 && num % divisor == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num, k;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            num = sc.nextInt();
            System.out.print("Enter Number Length: ");
            k = sc.nextInt();
        }
        int result = Count(num, k);
        System.out.println(result);
    }
}
