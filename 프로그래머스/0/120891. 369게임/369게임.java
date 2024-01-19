class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String orderString = Integer.toString(order);
        String [] orderStringList = orderString.split("");
        
        for (int i = 0; i < orderStringList.length; i++) {
            if (orderStringList[i].equals("3") || orderStringList[i].equals("6") || orderStringList[i].equals("9"))
                answer++;
        }
        
        return answer;
    }
}