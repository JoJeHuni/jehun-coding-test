import heapq

def solution(scoville, K):
    heapq.heapify(scoville)
    mix_count = 0  

    while len(scoville) > 1:
        min1 = heapq.heappop(scoville)
        if min1 >= K:
            return mix_count
        
        min2 = heapq.heappop(scoville)
        new_food = min1 + (min2 * 2)
        heapq.heappush(scoville, new_food)
        mix_count += 1

    if scoville[0] >= K :
        return mix_count
    else :
        return -1
