i = int(input())

# i = 55
acc = 0
for j in range(i):
    acc += j
    # print(acc)
    if acc >= i:
        print(j)
        break

