public class IndexOfFirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if (n == 0) return 0;
        if (n > m) return -1;
        int i=0, j=0;
        while (i < m) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == n) {
                    return i - j;
                }
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "badbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
}
