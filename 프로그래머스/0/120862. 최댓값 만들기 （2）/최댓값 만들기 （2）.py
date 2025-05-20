def solution(numbers):
    answer = 0
    numbers.sort()
    
    front = numbers[0] * numbers[1]
    behind = numbers[len(numbers) - 1] * numbers[len(numbers) - 2]
    
    if (front >= behind) : answer = front
    else : answer = behind
    
    return answer