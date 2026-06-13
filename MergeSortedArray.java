// import  java.util.*;

public class MergeSortedArray {
    public static  void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0;
        int[] result = new int[m+n];
        for(int k=0;k<m+n-1;k++) {
            if(i == m-1) {
                result[k] = nums2[j];
                j++; 
            }
            else if(j == n-1) {
                result[k] = nums1[i];
                i++;
            }
            else if(nums1[i] < nums2[j]) {
                result[k] = nums1[i];
                i++;
            } else {
                result[k] = nums2[j];
                j++;
            }
        }
        for(int k=0;k<m+n-1;k++) {
            System.out.print(result[k]+ "   ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,5,7,11};
        int m = nums1.length;
        int[] nums2 = {2,3,6,7,13,16};
        int n = nums2.length;

        merge(nums1, m, nums2, n);
    }
}
