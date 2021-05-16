class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        
        ArrayList<Boolean> kids = new ArrayList<Boolean>();
        for (int candy: candies) {
            if (candy + extraCandies >= max) {
                kids.add(true);
            } else {
                kids.add(false);
            }
        }
        return kids;
    }
}