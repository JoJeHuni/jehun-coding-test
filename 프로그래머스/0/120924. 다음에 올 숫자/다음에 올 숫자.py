def solution(common):
    answer = 0
    one = common[0]
    two = common[1]
    three = common[2]
    
    if (two - one == three - two) :
        answer = common[-1] + (two - one)
    elif (two // one == three // two) :
        answer = common[-1] * (two // one)
    
    return answer