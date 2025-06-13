def solution(N, stages):
    answer = []
    fail_rate = []
    total = len(stages)
    
    for stage in range(1, N + 1):
        count = stages.count(stage)
        if total == 0:
            fail_rate.append((stage, 0))
        else:
            fail_rate.append((stage, count / total))
        total -= count
        
    print(fail_rate)
    
    fail_rate.sort(key=lambda x: (-x[1], x[0]))
    
    answer = [stage for stage, _ in fail_rate]
    
    return answer
