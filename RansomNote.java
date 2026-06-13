// LEETCODE 383
import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int j = 0; j < magazine.length(); j++) {
            char ch = magazine.charAt(j);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String ransomNote = "bbaa";
        String magazine = "aabbdefktrf";
        System.out.println(canConstruct(ransomNote, magazine));       
    }
}
 