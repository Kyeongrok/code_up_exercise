num = input()
# 16진수를 10진수로 바꿔서 곱하고 16진수로 바꾼다
# num = 'B'
h_to_d = int(num, 16)
for i in range(15):
    multiple = h_to_d * (i + 1)
    print('{0:}*{1:X}={2:X}'.format(num, i + 1, multiple))
