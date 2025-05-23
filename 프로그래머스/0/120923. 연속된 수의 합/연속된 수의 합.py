def solution(num, total):
    answer = []
    mid = total // num
    bignum = mid + 1
    smallnum = mid - 1

    total -= mid
    answer.append(mid)

    while len(answer) < num:
        if len(answer) < num:
            total -= bignum
            answer.append(bignum)
            bignum += 1
        if len(answer) < num:
            total -= smallnum
            answer.append(smallnum)
            smallnum -= 1

    return sorted(answer)