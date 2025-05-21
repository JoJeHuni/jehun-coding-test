def solution(emergency):
    answer = [0 for i in range(len(emergency))]
    sort = sorted(emergency)
    dic = {}
    num = len(sort)
    
    for i in range(len(sort)) :
        for j in range(len(sort)) :
            if (sort[i] == emergency[j]) :
                answer[j] = num
                num -= 1
                break
    
    return answer