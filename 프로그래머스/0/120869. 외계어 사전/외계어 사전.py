def solution(spell, dic):
    answer = 0
    
    for i in range(len(dic)) :
        for j in range(len(spell)) :
            if (spell[j] in dic[i]) :
                if(j == len(spell) - 1) :
                    answer = 1
                    break
                else :
                    continue
            else :
                answer = 2
                break
                
            if (answer == 1) :
                break    
        if (answer == 1) :
            break
                    
    return answer