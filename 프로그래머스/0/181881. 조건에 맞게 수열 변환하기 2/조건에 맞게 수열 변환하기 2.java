class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int count = 0;
        int size = arr.length;
        int[] test = new int[size];
        
        while (count != size) {
            count = 0;
            test = arr.clone();
            
            for (int i = 0; i < size; i++) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) {
                    arr[i] /= 2;
                } else if (arr[i] % 2 != 0 && arr[i] < 50) {
                    arr[i] = arr[i] * 2 + 1;
                }
                
                if (arr[i] == test[i]) count ++;
            }
            answer ++;
        }
        return answer - 1;
    }
}