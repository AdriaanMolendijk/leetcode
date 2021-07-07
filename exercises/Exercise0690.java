/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        
        for (Employee emp : employees) {
            if (emp.id == id) {
                if (emp.subordinates == null) {
                    // no children
                    return emp.importance;
                } else {
                    // children
                    int out = emp.importance;
                    for (int ids : emp.subordinates) {
                        out += getImportance(employees, ids);
                    }
                    return out;
                }
            }
        }
        
        return 0;
    }
}
