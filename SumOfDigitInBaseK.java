
public class SumOfDigitInBaseK {
    public static void main(String[] args) {
        int n = 123456;
        int k = 9;
        System.out.println(sumBase(n, k));
    }

    public static int sumBase(int n, int k) {
        int sum = 0;
        while(n > 0) {
            sum += n % k;
            n/=k;
        }
        return sum;
    }

    // public static int sumBase(int n, int k) {
    //     if(n == 0) return 0;
    //     StringBuilder sb = new StringBuilder();
    //     while(n > 0) {
    //         int rem = n % k;
    //         sb.append(rem);
    //         n /= k;
    //     }
    //     int num = Integer.parseInt(sb.toString());
    //     int sum = 0;
    //     while(num > 0) {
    //         sum = sum + (num % 10);
    //         num /= 10;
    //     }
    //     return sum;
    // }
}
