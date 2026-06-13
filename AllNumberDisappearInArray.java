import java.util.*;

public class AllNumberDisappearInArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num : nums) set2.add(num);
        for(int i=0;i<nums.length;i++) {
            set1.add(i+1);
        }
        for(int num : set1) {
            if(!set2.contains(num)) {
                list.add(num);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer>  result = findDisappearedNumbers(nums);
        System.out.println(result);
    }
}
