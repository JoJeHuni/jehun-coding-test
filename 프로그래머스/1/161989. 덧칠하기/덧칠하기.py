def solution(n, m, section):
    answer = 0
    i = 0
    
    while i < len(section):
        start = section[i]
        i += 1
        while i < len(section) and section[i] < start + m:
            i += 1
        answer += 1
        
    return answer