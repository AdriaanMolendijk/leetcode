class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            if (item.get(0).equals(ruleValue) && ruleKey.equals("type")) {
                count++;
                continue;
            }
            if (item.get(1).equals(ruleValue) && ruleKey.equals("color")) {
                count++;
                continue;
            }
            if (item.get(2).equals(ruleValue) && ruleKey.equals("name")) {
                count++;
                continue;
            }
        }
        return count;
    }
}