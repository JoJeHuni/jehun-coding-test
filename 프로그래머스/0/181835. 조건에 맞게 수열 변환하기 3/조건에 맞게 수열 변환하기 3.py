def solution(arr, k):
    answer = arr
    if (k % 2 == 0) :
        for i in range (0, len(arr)) :
            answer[i] = arr[i] + k
    else :
        for i in range (0, len(arr)) :
            answer[i] = arr[i] * k
    return answer