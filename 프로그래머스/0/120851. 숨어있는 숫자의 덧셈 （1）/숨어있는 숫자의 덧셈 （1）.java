class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] stringArray = my_string.split("");
        
        for(String i : stringArray) {
            answer += Integer.parseInt(i);
        }
        
        return answer;
    }
}