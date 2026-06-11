//   All letters in this word are capitals, like "USA".
//   All letters in this word are not capitals, like "leetcode".
//   Only the first letter in this word is capital, like "Google".

import java.util.Scanner;

public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        int n = word.length();
        int UpperCount = 0;
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))) UpperCount++;
        }
        if (UpperCount == n) return true;
        else if (UpperCount == 0) return true;
        else if (UpperCount == 1 && Character.isUpperCase(word.charAt(0))) return true;
        return false;
    }
    public static void main(String[] args) {
        String word;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Word: ");
            word = sc.nextLine();
        }
        System.out.println(detectCapitalUse(word));
    }
}

// ALL RIGHT SIDE CHARACTERS ARE ZERO

/*public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        int n = word.length();
        int UpperCount = 0 , LowerCount = 0;
        for(int i=0;i<n;i++) {
            if(Character.isUpperCase(word.charAt(i))) UpperCount++;
            else break;
        }
        for(int i=n-1;i>=0;i--) {
            if(!Character.isUpperCase(word.charAt(i))) LowerCount++;
            else break;
        }
        return UpperCount + LowerCount == n;
    }
    public static void main(String[] args) {
        String word = "leeTcode";
        System.out.println(detectCapitalUse(word));
    }
}*/