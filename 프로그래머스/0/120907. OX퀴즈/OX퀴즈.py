def solution(quiz):
    answer = [0 for i in range(len(quiz))]
    one = ['' for i in range(len(quiz))]
    operator = ['' for i in range(len(quiz))]
    two = ['' for i in range(len(quiz))]
    result = ['' for i in range(len(quiz))]
    
    for i in range(len(quiz)) :
        one[i] = quiz[i].split(" ")[0]
        operator[i] = quiz[i].split(" ")[1]
        two[i] = quiz[i].split(" ")[2]
        result[i] = quiz[i].split(" ")[4]
    
    print(one, operator, two, result)
    
    for i in range(len(quiz)) :
        if (operator[i] == "+") :
            if (int(result[i]) == int(one[i]) + int(two[i])) :
                answer[i] = "O"
            else : answer[i] = "X"
        elif(operator[i] == "-") :
            if (int(result[i]) == int(one[i]) - int(two[i])) :
                answer[i] = "O"
            else : answer[i] = "X"
    return answer