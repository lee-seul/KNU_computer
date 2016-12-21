# coding: utf-8

import turtle, threading, random, math

class tt(threading.Thread):
    def run(self):
        while(True):
            knut.right(random.randint(-359, 360))
            knut.forward(random.randint(-200, 200))
            distance = math.sqrt(knut.xcor() ** 2 + (knut.ycor()-100) **2)
            if distance > 100:
                knut.undo()

wn = turtle.Screen()
knut = turtle.Turtle()

knut.circle(100)
knut.left(90)
knut.forward(100)

t1 = tt()
t1.setDaemon(True)
t1.start()

wn.onkey(wn.bye, 'q')

wn.listen()
wn.mainloop()

