import java.util.*;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();

        for (String word : words) {
            if (match(word, pattern))
                ans.add(word);
        }

        return ans;
    }

    public boolean match(String word, String pattern) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (map1.containsKey(p) && map1.get(p) != w)
                return false;

            if (map2.containsKey(w) && map2.get(w) != p)
                return false;

            map1.put(p, w);
            map2.put(w, p);
        }

        return true;
    }
}


OUTPUT

Input
words =
["abc","deq","mee","aqq","dkd","ccc"]
pattern =
"abb"
Output
["mee","aqq"]
