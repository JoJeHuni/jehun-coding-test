def solution(array):
    arr = [0 for i in range(1000)]
    for num in array:
        arr[num] += 1

    max_count = max(arr)
    if arr.count(max_count) > 1:
        return -1
    return arr.index(max_count)