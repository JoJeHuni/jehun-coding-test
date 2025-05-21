from collections import Counter

def solution(i, j, k):
    answer = 0
    
    for a in range(i, j + 1):
        answer += Counter(str(a))[str(k)]
    
    return answer