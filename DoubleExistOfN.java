import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DoubleExistOfN {
    public static boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> Double = new HashMap<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
        for(int i=0;i<arr.length;i++) {
            if(!Double.containsValue(arr[i])) {
                if(arr[i] < 0 && arr[i] % 2 == 0) {
                    int key = arr[i];
                    int value = arr[i] / 2;
                    Double.put(key, value);
                } else {
                    int key = arr[i];
                    int value = 2 * arr[i];
                    Double.put(key, value);
                }
            } else return true;
        }
        return false;
    } 
    public static void main(String[] args) {
        int n;
        int[] arr;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            n = sc.nextInt();
            arr = new int[n];
            System.out.println("Enter Elements: ");
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
        }
        System.out.println(checkIfExist(arr));
    }
}
