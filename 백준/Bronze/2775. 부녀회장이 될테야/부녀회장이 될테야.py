t = int(input())
answer = []

for _ in range(t):
    k = int(input())
    n = int(input())
    people = [i for i in range(1, n+1)]
    for k in range(k):
        for j in range(1, n):
            people[j] += people[j-1]
    answer.append(people[-1])

for i in range(0, len(answer)):
    print(answer[i])