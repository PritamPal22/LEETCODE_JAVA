public class ReverseVowelOfAString {
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length-1;
        int i=0;
        int j=n;
        String vowels = "aeiouAEIOU";
        while(i<j) {
            if (vowels.contains(String.valueOf(chars[i])) && vowels.contains(String.valueOf(chars[j]))) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
            else if(!vowels.contains(String.valueOf(chars[i])) && !vowels.contains(String.valueOf(chars[j]))) {
                i++;
                j--;
            }
            else if(!vowels.contains(String.valueOf(chars[i])) && vowels.contains(String.valueOf(chars[j]))) i++;
            else j--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String s = "IceCreAm"; //AceCreIm
        System.out.println(reverseVowels(s));
    }
}
