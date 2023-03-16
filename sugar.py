
s = int(input())
a = 0
while s > 0:
    if (s % 5) == 0:
         a += (s // 5)
         s = 0
    else:
         s -= 3
         a += 1
if s != 0:
    print(-1)
else:
    print(a)

