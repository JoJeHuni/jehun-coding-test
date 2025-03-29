N = int(input())
answer = 1
num = 1

while N > num:
    num += 6 * answer
    answer += 1

print(answer)