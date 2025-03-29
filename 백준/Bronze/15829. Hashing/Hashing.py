L = int(input())
str = input()
hash = 0
M = 1234567891

for i in range(L) :
    current = ord(str[i]) - 96
    hash += current * 31 ** i

print(hash)