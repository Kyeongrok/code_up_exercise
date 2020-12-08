i = int(input())

s = 0
for j in range(2, i + 1):
    if j % 2 == 0:
        s += j
print(s)
