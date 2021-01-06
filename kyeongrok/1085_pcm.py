i = input()
h, b, c, s = i.split(' ')

by = int(h) * int(b) * int(c) * int(s) / 8

print('{0:.1f} MB'.format(by / 1024 / 1024))
