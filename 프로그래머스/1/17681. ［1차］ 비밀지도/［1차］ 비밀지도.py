def solution(n, arr1, arr2):
    answer = []
    strarr1 = []
    strarr2 = []
    string1 = ''
    string2 = ''
    
    for i in range(n) :
        for j in range(n) :
            string1 += str(arr1[i] % 2)
            string2 += str(arr2[i] % 2)
            arr1[i] = arr1[i] // 2
            arr2[i] = arr2[i] // 2
        
        string1 = string1[::-1]
        string2 = string2[::-1]
        
        if (len(string1) < n) :
            while (len(string1) < n) :
                string1 = '0' + string1
        
        if (len(string2) < n) :
            while (len(string2) < n) :
                string2 = '0' + string2
        
        row = ''
        for j in range(n):
            if string1[j] == '1' or string2[j] == '1':
                row += '#'
            else:
                row += ' '
        answer.append(row)
        
        strarr1.append(string1)
        strarr2.append(string2)
        string1 = ''
        string2 = ''
    
    return answer