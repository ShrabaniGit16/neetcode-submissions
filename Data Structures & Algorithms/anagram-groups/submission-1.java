class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            String unique = sorting(s);
            map.computeIfAbsent(unique, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
    private String sorting(String ele) {
        char[] chars = ele.toCharArray();
        Arrays.sort(chars);
        String sortedVal = new String(chars);
        return sortedVal;
    }
}
