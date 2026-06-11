public class CountNegInASortedMtx {
    public static int countNegatives(int[][] grid) {
        int i = 0;
        int j = grid[0].length - 1;
        int count = 0;
        while(i < grid.length && j >= 0) {
            if(grid[i][j] < 0) {
                count += (grid.length - i); 
                j--;
            } else {
                i++;
            }
        }

        /*int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i=0;i<m;i++) {
            for(int j=n-1;j>=0;j--) {
                if(grid[i][j] >= 0) break;
                else count++;
            }
        }*/

        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {
            {4,3,2,-1},
            {3,2,1,-1},
            {1,1,-1,-2},
            {1,-1,-2,-3}
        };
        System.out.println(countNegatives(grid));
    }
}
