def solution(t, p):
    answer = 0
    num = ''
    
    for i in range(0, len(t) - len(p) + 1):
        for j in range(i, i + len(p)):
            num += t[j]
        print(num)
        if (int(num) <= int(p)):
            answer += 1
        num = ''
    
    return answer