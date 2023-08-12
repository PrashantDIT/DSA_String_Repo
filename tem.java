public class tem {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                if (hasUniqueCharacters(temp))
                    count++;
            }
        }
        return count;
    }

    public boolean hasUniqueCharacters(String str) {
        boolean[] visited = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (visited[c]) {
                return false;
            }
            visited[c] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        tem ob = new tem();
        int count = ob.lengthOfLongestSubstring("abcabcbb");
        System.out.print(count);
    }
}
