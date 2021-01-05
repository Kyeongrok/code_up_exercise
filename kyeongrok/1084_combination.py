i = input()
r, g, b = i.split(' ')
c = 0
for i in range(int(r)):
    for j in range(int(g)):
        for k in range(int(b)):
            print(i, j, k)
            c += 1

print(c)
