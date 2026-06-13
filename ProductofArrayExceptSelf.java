class ProductofArrayExceptSelf {
    public static void main(String[] args) {

        int[] Arr = {10, 3, 0, 6, 8, 2, 0};
        int n = Arr.length;

        System.out.println("The Original Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Arr[i] + "\t");
        }
        System.out.println();

        ProductofArrayExceptSelf obj = new ProductofArrayExceptSelf();
        int[] result = obj.productExceptSelf(Arr);

        System.out.println("The Output Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + "\t");
        }
        System.out.println();
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int Mul = 1;
        int zerocount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zerocount++;
            } else {
                Mul *= nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (zerocount >= 2 || (zerocount == 1 && nums[i] != 0)) {
                nums[i] = 0;
            } else if (nums[i] == 0 && zerocount == 1) {
                nums[i] = Mul;
            } else {
                nums[i] = Mul / nums[i];
            }
        }
        return nums;
    }
}
