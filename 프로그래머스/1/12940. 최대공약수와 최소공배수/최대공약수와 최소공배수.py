import math

def solution(n, m):
    answer = []
    
    gcd = math.gcd(n,m)
    answer.append(gcd)
    
    one = n / gcd
    two = m / gcd
    
    answer.append(gcd * one * two)
    
    return answer