from _collections import deque

i = int(input())
st = deque()
while i > 10:
    r = i % 10
    q = i // 10
    st.append(r)
    i = q
st.append(i)

d = 4
while len(st) > 0:
    print('[{}]'.format(st.pop() * pow(10, d)))
    d -= 1

