def solution(progresses, speeds):
    answer = []
    clear = [0] * len(speeds)

    for i in range (0, len(speeds)) :
        clear[i] = (100 - progresses[i]) // speeds[i]
        if (100 - progresses[i]) % speeds[i] != 0:
            clear[i] += 1

    count = 1
    maxNum = clear[0]
    
    for i in range(1, len(speeds)):
        if maxNum >= clear[i]:  
            count += 1
        else:
            answer.append(count)
            maxNum = clear[i]
            count = 1

    answer.append(count)
    return answer