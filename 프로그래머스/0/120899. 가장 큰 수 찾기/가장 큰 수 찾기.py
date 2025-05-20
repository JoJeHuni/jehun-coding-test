def solution(array):
    answer = [0 for i in range (2)]
    max = array[0]
    for i in range (0, len(array)) :
        if (max <= array[i]) :
            max = array[i]
            answer[0] = max
            answer[1] = i
    
    return answer