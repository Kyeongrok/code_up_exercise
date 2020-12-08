def make_a_grid():
    memo = [['0'] * 10 for i in range(10)]

    for y in range(len(memo)):
        for x in range(len(memo[y])):
            if y == 0 or y == 9 or x == 0 or x == 9:
                memo[y][x] = '1'

    memo[6][6] = '2'
    return memo

x, y = 1, 1
memo = [input().split(' ') for _ in range(10)]
for _ in range(100):

    if x < len(memo[0]) - 1 and memo[y][x] == '0' and memo[y][x + 1] != '1':
        memo[y][x] = '9'
        x += 1
    elif x < len(memo[0]) - 1 and memo[y][x] == '0' and memo[y][x + 1] != '0':
        memo[y][x] = '9'
        y += 1
    elif memo[y][x] == '2':
        memo[y][x] = '9'
        break
for r in memo:
    print(' '.join(r))

