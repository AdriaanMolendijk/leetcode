class Solution {
    public String interpret(String command) {
        String out = command.replace("()", "o").replace("(al)","al");
        return out;
    }
}