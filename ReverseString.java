public class ReverseString {
    public static void reverseString(char[] s) {
        int n = s.length-1;
        int j = n;
        for(int i=0;i<=n/2;i++,j--) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
        }
        for(int i=0;i<=n;i++) {
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char[] s = {'p','a','l','i','n','d','r','o','m','e'};
        reverseString(s);
    }
}
