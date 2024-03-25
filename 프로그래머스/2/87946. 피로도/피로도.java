class Solution {
    public int answer;
    public boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);

        return answer;
    }

    public void dfs(int depth, int k, int[][] dungeons) {
        
        for (int i = 0; i < dungeons.length; i++) {
            // 방문하지 않은 상태면서 k가 최소 필요 피로도보다 크거나 같은 경우
            if (visited[i] == false && dungeons[i][0] <= k) {
                visited[i] = true; // 방문 처리
                dfs(depth + 1, k - dungeons[i][1], dungeons); // 재귀 호출
                visited[i] = false; // 방문 초기화
            }
        }
        
        answer = Math.max(answer, depth);
    }
}