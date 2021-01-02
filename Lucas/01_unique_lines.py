import turtle
import time
tt=turtle.Turtle()
tt.color('blue')
tt.speed('fastest')

tt.penup()
tt.goto(-300,100)
tt.pendown()

for i in range(1000):
    tt.forward(500)
    tt.left(113.6)

tt.penup()
tt.goto(-350,100)
tt.pendown()

for i in range(1000):
    tt.forward(500)
    tt.left(113.6)


tt.color('red')

tt.penup()
tt.goto(-300,100)
tt.pendown()
for i in range(1000):
    tt.forward(500)
    tt.left(113.6)

tt.penup()
tt.goto(-320,60)
tt.pendown()

for i in range(1000):
    tt.forward(700)
    tt.left(113.6)

tt.color('green')

tt.penup()
tt.goto(300,10)
tt.pendown()

for i in range(1000):
    tt.forward(900)
    tt.left(113.6)

tt.penup()
tt.goto(300,400)
tt.pendown()

for i in range(1000):
    tt.forward(1000)
    tt.left(113.6)

