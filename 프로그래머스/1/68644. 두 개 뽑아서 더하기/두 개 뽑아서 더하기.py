def solution(numbers):
    answer = []
    
    numbers.sort()
    plus = numbers[0] + numbers[1]
    answer.append(plus)
    
    for i in range(len(numbers) - 1) :
        for j in range(i + 1, len(numbers)) :
            if (numbers[i] + numbers[j] not in answer) :
                answer.append(numbers[i] + numbers[j])
            else :
                continue
    
    return sorted(answer)