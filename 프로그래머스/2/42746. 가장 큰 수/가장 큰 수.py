def solution(numbers):
    answer = ''
    
    numbers_str = list(map(str, numbers))
    numbers_str.sort(key=lambda x: x*3, reverse=True)
    
    for i in range (0, len(numbers_str)) :
        answer += numbers_str[i]
    
    if (numbers_str[0] == "0" and numbers_str[len(numbers_str) - 1] == "0") :
        return "0"
    
    return answer