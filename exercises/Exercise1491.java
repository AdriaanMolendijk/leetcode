class Solution {
    
    public double average(int[] salary) {
        
        int maximum = 0;
        int minimum = Integer.MAX_VALUE;
        for (int sal : salary) {
            maximum = Math.max(maximum, sal);
            minimum = Math.min(minimum, sal);
        }
        
        ArrayList<Integer> rebased = new ArrayList<Integer>();
        for (int sal : salary) {
            if (minimum < sal & sal < maximum) {
                rebased.add(sal);
            }
        }
        
        int n = rebased.size();
        double avg = 0;
        for (int reb : rebased) {
            avg += reb;
        }
        return avg / n;
    }
    
}
