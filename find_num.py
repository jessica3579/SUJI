N = int(input())
N_num = []
M_num = []
count_n = 0
count_m = 0
while True:
    num = int(input())
    N_num.append(num)
    print(num)
    count_n += 1
    if count_n == N:
        break
for i in N_num:
    print(i)
M = int(input())
while True:
    num = int(input())
    M_num.append(num)
    print(num)
    count_n += 1
    if count_n == M:
        break
for i in M_num:
    print(i)
c = 0
for t in range(0, N):
    for i in range(0, M):
        if M_num[t] == N_num[i]:
            c += 1
        if c == 1:
            print(1)
            c = 0
        else:
            print(0)

'''
----------------------------------------
n = int(input())
A = list(map(int, input().split()))
A.sort()
m = int(input())
B = list(map(int, input().split()))

for i in B:
    high = n-1
    low = 0
    mid = (high+low)//2
    rec = 0
    while low<=high:
        if A[mid]== i:
            rec = 1
            break
        elif A[mid]<i:
            low = mid+1
        elif A[mid]>i:
            high= mid-1
        mid = (high+low)//2

    print(rec)
    
-----------------------------------
import sys
n = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))
A.sort()
m = int(sys.stdin.readline())
B = list(map(int, sys.stdin.readline().split()))

for i in B:
    high = n-1
    low = 0
    mid = (high+low)//2
    rec = 0
    while low<=high:
        if A[mid]== i:
            rec = 1
            break
        elif A[mid]<i:
            low = mid+1
        elif A[mid]>i:
            high= mid-1
        mid = (high+low)//2

    print(rec)

'''


