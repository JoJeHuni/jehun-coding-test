def solution(balls, share):
    combo = balls
    people = share
    for i in range(1, share):
        combo = combo * (balls - i)
        people = people * (share - i)
    
    print (combo, people)
    answer = int(combo / people)
    return answer