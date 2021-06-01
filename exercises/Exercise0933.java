import java.util.ArrayList;

class RecentCounter {

    ArrayList<Integer> requests;

    public RecentCounter() {
        requests = new ArrayList<Integer>();
    }

    public int ping(int t) {
        requests.add(t);
        int count = 0;
        for (int r : requests) {
            if (r >= t - 3000) count++;
        }
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
