def solution(sides):
    answer = 0
    one = min(sides)
    two = max(sides)
    maxnum = one + two
    
    for i in range (1, maxnum) :
        if (i <= two and i + one > two) :
            answer += 1
        elif (i > two and one + two > i) :
            answer += 1
    
    return answer