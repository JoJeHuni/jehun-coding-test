def solution(chicken):
    answer = 0
    coupon = chicken
    answer += coupon // 10
    
    while (coupon > 9) :
        coupon = coupon // 10 + coupon % 10
        answer += coupon // 10
    
    return answer