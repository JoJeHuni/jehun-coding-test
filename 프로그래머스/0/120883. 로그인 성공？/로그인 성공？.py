def solution(id_pw, db):
    answer = ''
    
    for i in range(len(db)):
        if (id_pw[0] == db[i][0]) :
            if (id_pw[1] == db[i][1]) :
                answer = 'login'
                return answer
            else :
                answer = 'wrong pw'
                return answer
    
    answer = 'fail'
    return answer