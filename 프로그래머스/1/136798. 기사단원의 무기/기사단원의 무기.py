def solution(number, limit, power):
    answer = 0
    a = []
    count = 0
    for i in range(1, number + 1) :
        for j in range(1, int(i ** (1/2) + 1)) :
            if (i % j == 0) :
                count += 1
                if (j != i // j) :
                    count += 1
    
        a.append(count)
        count = 0
    
    for i in range(len(a)) :
        if (a[i] > limit) :
            answer += power
        else :
            answer += a[i]
    
    return answer