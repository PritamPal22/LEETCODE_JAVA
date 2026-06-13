public class MinimumCommonValue {
    public static  int getCommon(int[] nums1, int[] nums2) {
        int i=0, j=0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) return nums1[i];
            else if(nums1[i] > nums2[j]) j++;
            else i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,8};
        int[] nums2 = {4,6,7,8};
        System.out.println(getCommon(nums1, nums2));
    }
}
