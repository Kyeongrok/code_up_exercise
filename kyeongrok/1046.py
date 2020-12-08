from statistics import mean
i = input()
# i = '10 3 21'
y, m, d = i.split(' ')
l = [int(y), int(m), int(d)]
print(sum(l))
print('{0:.1f}'.format(mean(l)))