def solution(polynomial):
    polynomial = polynomial.split(" + ")
    count = 0
    xcount = 0

    for i in range(len(polynomial)) :
        if 'x' in polynomial[i]:
            if polynomial[i] == 'x':
                xcount += 1
            else:
                xcount += int(polynomial[i].replace('x', ''))
        else :
            count += int(polynomial[i])
    
    if xcount > 0 and count > 0:
        answer = (str(xcount) + "x" if xcount != 1 else "x") + " + " + str(count)
    elif xcount > 0:
        answer = str(xcount) + "x" if xcount != 1 else "x"
    else:
        answer = str(count)

    return answer
