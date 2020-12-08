mo = lambda i: list(map(int, i.split(' ')))
for l in mo(input()):
    if l % 2 == 0:
        print('even')
    else:
        print('odd')
