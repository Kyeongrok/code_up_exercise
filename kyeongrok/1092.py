i = input()
# i = '3 7 9'
mo = list(map(int, i.split(' ')))
day = 1
while day % mo[0] != 0 or day % mo[1] != 0 or day % mo[2] != 0:
    day += 1
print(day)