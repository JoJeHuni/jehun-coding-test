def solution(my_string):
    answer = 0
    my_string = my_string.split(' ')
    
    for i in range(1, len(my_string), 2):
        print(i)
        if (i == 1) :
            if (my_string[i] == '+') :
                answer += int(my_string[0]) + int(my_string[2])
            if (my_string[i] == '-') :
                answer += int(my_string[0]) - int(my_string[2])
        if (i != 1 and my_string[i] == '+') :
            answer = answer + int(my_string[i+1])
        if (i != 1 and my_string[i] == '-') :
            answer = answer - int(my_string[i+1])
        
    return answer