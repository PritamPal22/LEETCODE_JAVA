public class KthMissingPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {
        int i=0;
        int j=1;
        while(k > 0 ) {
            if(i >= arr.length) {
                j++;
                k--;
            }
            else if(arr[i] == j) {
                i++;
                j++;
            }
            else {
                j++;
                k--;
            }
        }
        return j-1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
        System.out.println(findKthPositive(arr, k));
    }
}
