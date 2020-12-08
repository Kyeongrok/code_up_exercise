i = input()
mo = list(map(int, i.split(' ')))

for i in range(1, mo[0] + 1):
    for j in range(1, mo[1] + 1):
        print(i, j)
