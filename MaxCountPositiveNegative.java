public class MaxCountPositiveNegative {
    public static int maximumCount(int[] nums) {
        int Ncount = 0;
        int Pcount = 0;
        int  i=0;
        while(i<nums.length) {
            if(nums[i] < 0) Ncount++;
            if(nums[i] > 0) Pcount++;
            i++; 
        }
        if(Ncount > Pcount) return Ncount;
        else return Pcount;
    }
    public static void main(String[] args) {
        int[] nums = {-2,-1,-1,1,2,3};
        System.out.println(maximumCount(nums));
    }
}