def solution(box, n):
    answer = 1
    
    for i in range (3) :
        box[i] = box[i] // n
    
    for i in range (3) :
        answer *= box[i]
    
    return answer