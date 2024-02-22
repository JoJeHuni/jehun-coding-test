import java.util.HashMap;

class Solution {
    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hash = new HashMap<>();

        // type 별로 옷 종류가 몇 개인지 세기
        for(int i = 0; i < clothes.length; i++){
            String cloth_type = clothes[i][1];
            hash.put(cloth_type, hash.getOrDefault(cloth_type, 1) + 1);
        }

        for (String key : hash.keySet()) {
            answer *= hash.get(key);
        }

        return answer - 1;
    }
}