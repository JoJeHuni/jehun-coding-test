def solution(M, N):
    answer = M - 1
    
    if (M == 1 and N == 1) :
        return 0
    
    answer += M * (N - 1)
    
    return answer