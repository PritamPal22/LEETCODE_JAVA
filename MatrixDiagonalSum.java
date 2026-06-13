public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int n = mat.length - 1;
        int i=0, j=n;
        int sum = 0;
        while(i <= n) {
            sum = sum + mat[i][i] + mat[i][j];
            i++;
            j--; 
        }
        if(n % 2 == 1) return sum;
        else return sum - mat[n/2][n/2];
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println(diagonalSum(mat));
    }
}
