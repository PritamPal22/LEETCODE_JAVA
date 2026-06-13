import java.util.Scanner;

public class MaximumSubarrayAverage {
    
    public static double MaxAvg(int[] arr, int k) {
        int n = arr.length;
        if (n < k || k <= 0) return 0.0;
        double sum = 0;
        for(int i=0;i<k;i++) {
            sum += arr[i];
        }
        double maxsum = sum;
        int j=0;
        for(int i=k;i<n;i++) {
            sum += arr[i];
            sum -= arr[j];
            j++;
            if(maxsum < sum) maxsum = sum;
        }
        return maxsum / k;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Aarray length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Elements of the array: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Subarray Length: ");
        int k = sc.nextInt();

        double result = MaxAvg(arr, k);
        System.out.println(result);

        sc.close();
    }
}
