def solution(my_string):
    answer = 0
    
    for i in my_string:
        if i.isalpha():
            my_string = my_string.replace(i, ' ')
    my_string = my_string.split()
    
    for i in range(len(my_string)) :
        answer += int(my_string[i])
    
    return answer