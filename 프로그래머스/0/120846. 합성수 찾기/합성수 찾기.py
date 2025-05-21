def solution(n):
    answer = 0
    
    for i in range(4, n + 1) :
        for j in range(2, int(i / 2) + 1) :
            if (i % j == 0) :
                answer += 1
                break
            else :
                continue
    
    return answer