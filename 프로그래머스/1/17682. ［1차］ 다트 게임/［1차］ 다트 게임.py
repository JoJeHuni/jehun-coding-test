def solution(dartResult):
    scores = []
    num = 0
    length = len(dartResult)
    i = 0
    
    while i < length :
        if dartResult[i] == '1' and i + 1 < length and dartResult[i + 1] == '0':
            num = 10
            i += 2
        else:
            num = int(dartResult[i])
            i += 1
        
        if (dartResult[i] in ['S', 'D', 'T']) :
            if (dartResult[i] == 'S') :
                num **= 1
            elif (dartResult[i] == 'D') :
                num **= 2
            elif (dartResult[i] == 'T') :
                num **= 3
            i += 1
        
        if (i < length and dartResult[i] in ['*', '#']) :
            if(dartResult[i] == '*') :
                num *= 2
                if (scores) :
                    scores[-1] *= 2
            elif(dartResult[i] == '#') :
                num *= -1
            i += 1
            
        scores.append(num)
    
    return sum(scores)