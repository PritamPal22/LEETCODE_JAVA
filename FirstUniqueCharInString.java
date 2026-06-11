import java.util.HashMap;

public class FirstUniqueCharInString {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> Map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(!Map.containsKey(ch)) {
                Map.put(ch, i);
            } else {
                Map.put(ch, -1);
            }
        }
        for (int i=0;i<s.length(); i++) {
            if (Map.get(s.charAt(i)) >= 0) {
                return Map.get(s.charAt(i));
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "pritamprt";
        System.out.println(firstUniqChar(s));
    }

}
