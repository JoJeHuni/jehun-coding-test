def solution(sizes):
    max1 = 0
    max2 = 0
    
    for i in range(len(sizes)):
        if sizes[i][0] < sizes[i][1]:
            sizes[i][0], sizes[i][1] = sizes[i][1], sizes[i][0]
    
    for i in range(len(sizes)):
        max1 = max(max1, sizes[i][0])
        max2 = max(max2, sizes[i][1])
    
    return max1 * max2
