import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(!stack.isEmpty() && stack.peek() == s.charAt(i))
                //pop으로 현재 peek 값을 제거하고
                stack.pop();
            else
                //조건이 만족하지 않으면 push를 통해 현재 값을 넣어준다
                stack.push(s.charAt(i));
        }
        return stack.isEmpty() ? 1 : 0;
    }
}