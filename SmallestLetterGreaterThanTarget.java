public class SmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length - 1 ;
        if(target >= letters[n]) return letters[0];
        int left = 0;
        int right = n;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(target < letters[mid]) right = mid - 1;
            else left = mid + 1;
        }
        if(target == letters[left]) {
            for(int i=left;i<=n;i++) {
                if(target != letters[i] && i <= n) return letters[i];
            }
            return letters[0];
        }
        return letters[left];
    }
    public static void main(String[] args) {
        // char[] letters = {'a','e','g','h','i','k','o','s','t','u','v'};
        char[] letters = {'e','e','e','e','e','e','n','n','n','n'};
        char target = 'e';
        System.out.println(nextGreatestLetter(letters, target));
    }
}