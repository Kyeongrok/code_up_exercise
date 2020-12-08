i = input()
y,m,d = i.split('.')
print('{0:04d}.{1:02d}.{2:02d}'.format(int(y), int(m), int(d)))