def solution(name, yearning, photo):
    answer = []
    sum = 0
    
    for i in range(len(photo)) :
        for j in range(len(photo[i])) :
            if (photo[i][j] in name) :
                index = name.index(photo[i][j])
                sum += yearning[index]
        answer.append(sum)
        sum = 0
    
    return answer