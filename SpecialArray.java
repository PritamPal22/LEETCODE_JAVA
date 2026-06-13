public class SpecialArray {
    public static int specialArray(int[] nums) {
        int n =  nums.length;
        int x  =0;
        while(x <= n){
            int count=0;
            for(int i=0;i<n;i++) {
                if(nums[i] >= x) {
                    count++;
                }
            }
            if(count == x) {
                return x;
            }
            x++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3,6,7,7,0};
        System.out.println(specialArray(nums));
    }
}
