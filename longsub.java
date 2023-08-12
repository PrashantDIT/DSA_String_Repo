public class longsub {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                if (hasUniqueCharacters(temp)) {
                    maxLength = Math.max(maxLength, temp.length());
                }
            }
        }
        return maxLength;
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
        int length = ob.lengthOfLongestSubstring("abcabcbb");
        System.out.print(length);
    }
}
