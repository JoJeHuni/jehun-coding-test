def solution(numbers):
    numbers.sort();
    i = len(numbers)
    answer = numbers[i - 1] * numbers[i - 2]
    return answer