def solution(keyinput, board):
    answer = [0 for i in range(2)]
    maxWidth = (board[0] - 1) / 2
    maxHeight = (board[1] - 1) / 2
    
    for i in range(len(keyinput)) :
        if (keyinput[i] == "left") :
            answer[0] -= 1
            if (answer[0] < (maxWidth * -1)):
                answer[0] += 1
        elif (keyinput[i] == "right") :
            answer[0] += 1
            if (answer[0] > maxWidth) :
                answer[0] -= 1
        elif (keyinput[i] == "up") :
            answer[1] += 1
            if (answer[1] > maxHeight) :
                answer[1] -= 1
        elif (keyinput[i] == "down") :
            answer[1] -= 1
            if (answer[1] < (maxHeight * -1)):
                answer[1] += 1
    
    return answer