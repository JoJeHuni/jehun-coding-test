def solution(dots):
    answer = 0
    width = 0
    height = 0
    
    for i in range(1, len(dots)) :
        if (dots[0][0] == dots[i][0]) :
            height = abs(dots[0][1] - dots[i][1])
            if (i == 1) :
                width = abs(dots[0][0] - dots[3][0])
            elif (i == 2) :
                width = abs(dots[0][0] - dots[3][0])
            elif (i == 3) :
                width = abs(dots[0][0] - dots[2][0])
    
    answer = width * height
    
    return answer