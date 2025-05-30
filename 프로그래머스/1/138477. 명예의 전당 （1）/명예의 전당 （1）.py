def solution(k, score):
    answer = []
    temp = []
    
    for i in range(len(score)) :
        if (len(answer) < k) :
            temp.append(score[i])
            temp.sort()
        elif(len(temp) == k and temp[0] < score[i]) :
            temp.pop(0)
            temp.append(score[i])
            temp.sort()
    
        answer.append(temp[0])
    
    return answer