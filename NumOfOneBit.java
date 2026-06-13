public class NumOfOneBit {
    public static int CountOneBitInBinary(int num) {
        String S = Integer.toString(num,2);
        int n = S.length();
        int count = 0;
        for(int i=0;i<n;i++) {
            if(S.charAt(i) == '1') count++;
        }
        return count;
    }

    /*public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            int btw=n&1;
            if(btw==1){
        
                count++;
            }
                n=n>>1;
            
        }
        return count;
    }*/

    public static void main(String[] args) {
        int num = 125;
        System.out.println("The Total Number of One is: " + CountOneBitInBinary(num));
    }
}
