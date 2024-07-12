import java.util.*;

public class Solution {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> num = new HashMap<>();                     // 장르별 총 재생 횟수 ex) [classic, 500]
        HashMap<String, HashMap<Integer, Integer>> song = new HashMap<>();  // 장르별 음악들의 재생 횟수 ex) [classic, [1, 500]]

        updateGenrePlayCounts(genres, plays, num, song);

        List<String> keySet = new ArrayList(num.keySet());
        Collections.sort(keySet, (s1, s2) -> num.get(s2) - (num.get(s1)));
 
        for(String key : keySet) {
            HashMap<Integer, Integer> map = song.get(key);
            List<Integer> genre_key = new ArrayList(map.keySet());
 
            Collections.sort(genre_key, (s1, s2) -> map.get(s2) - (map.get(s1)));
 
            answer.add(genre_key.get(0));
            if(genre_key.size() > 1)
                answer.add(genre_key.get(1));
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
    
    private static void updateGenrePlayCounts(String[] genres, int[] plays, HashMap<String, Integer> num, HashMap<String, HashMap<Integer, Integer>> song) {
        for (int i = 0; i < genres.length; i++) {
            if (!num.containsKey(genres[i])) {                              // 처음 보는 key가 들어오는 경우 ex) classic(0번째 인덱스에 있는)가 들어옴
                num.put(genres[i], plays[i]);                               // num에는 [classic, 500]
                HashMap<Integer, Integer> info = new HashMap<>();
                info.put(i, plays[i]);                                      // 새로운 Hash에 정보를 담는다. [0, 500]
                song.put(genres[i], info);                                  // 그 정보를 넣어주면 [classic, [0, 500]]
            }
            else {                                                          // 한 번 더 같은 키가 들어오면? ex) pop 600이 있는데 2500이 들어오면?
                song.get(genres[i]).put(i, plays[i]);                       // song에는 [pop, [4, 2500]]
                num.put(genres[i], num.get(genres[i]) + plays[i]);          // num에는 [pop, 600 + 2500]
            }
        }
    }
}