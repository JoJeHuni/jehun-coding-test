from collections import deque

def solution(A, B):
    if A == B:
        return 0

    dq = deque(A)

    for i in range(1, len(A) + 1):
        dq.rotate(1)
        if ''.join(dq) == B:
            return i

    return -1