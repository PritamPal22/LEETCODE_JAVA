import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int nums[] = {-9,-7,-5,-2,0,1,6,10,12};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n-1;
        int position = n-1;

        while(left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if(leftSquare > rightSquare) {
                result[position] = leftSquare;
                left++;
            } else {
                result[position] = rightSquare;
                right--;
            }
            position--;
        }
        return  result;
    }
}
