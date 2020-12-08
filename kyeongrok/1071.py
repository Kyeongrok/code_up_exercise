i = input()
# i = '7 4 2 9 0 8'
mo = list(map(int, i.split(' ')))

for n in mo:
    if n != 0:
        print(n)
    else:
        break


