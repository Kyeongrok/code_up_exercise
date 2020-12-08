i = input()
# i = '16:23:57'
# i = '2020.11.19'
y, m, d = i.split('.')
print('{0:02d}-{1:02d}-{2:04d}'.format(int(d), int(m), int(y)))