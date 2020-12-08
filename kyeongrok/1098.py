import matplotlib.pyplot as plt
import numpy as np

mo = lambda i: list(map(int, i.split(' ')))
y_len, x_len = input().split(' ')
line_cnt = int(input())
memo = [mo(input()) for _ in range(line_cnt)]

# print(memo)
dp = [[0] * int(x_len) for _ in range(int(y_len))]
# print(dp)
for info in memo:
    # print dot
    for i in range(info[0]):
        # print('h' if info[1] == 0 else 'v', info[2], info[3], i)
        if info[1] == 0:
            dp[info[2]-1][info[3]-1 + i] = 1
        elif info[1] == 1:
            dp[info[2]-1 + i][info[3]-1] = 1

for l in dp:
    print(' '.join(map(str, l)))
