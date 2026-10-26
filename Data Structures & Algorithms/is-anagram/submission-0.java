class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();

        for (char ele : s.toCharArray()) {
            map.merge(ele, 1, Integer::sum);
        }

        for (char ele : t.toCharArray()) {
            map.merge(ele, -1, Integer::sum);
        }

        for (int count : map.values()) {
            if (count != 0)
                return false;
        }
        return true;
    }
}
