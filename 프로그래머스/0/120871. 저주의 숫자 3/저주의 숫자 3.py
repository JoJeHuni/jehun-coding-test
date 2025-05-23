def solution(n):
    count = 0
    num = 0

    while count < n:
        num += 1
        if ("3" in str(num) or num % 3 == 0) :
            continue
        count += 1

    return num
