import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    public String destCity(List<List<String>> paths) {
        Set<String> cities = new HashSet<String>();
        for (List<String> path : paths) {
            cities.addAll(path);
        }
        for (List<String> path : paths) {
            String city = path.get(0);
            cities.remove(city);
        }
        if (cities.size() == 1)
            for (String city : cities) return city;
        throw new IllegalStateException("Wrong input");
    }

}
