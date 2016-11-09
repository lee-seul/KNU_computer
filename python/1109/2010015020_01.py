# coding: utf-8

import turtle


def paint_triangle():
    for i in range(3):
        knut.left(120)
        knut.forward(60)

def paint_rectangle():
    for i in range(4):
        knut.right(90)
        knut.forward(60)

def paint_circle():
    knut.circle(20)

wn = turtle.Screen()
knut = turtle.Turtle()


wn.onkey(paint_circle, "c")
wn.onkey(paint_rectangle, "r")
wn.onkey(paint_triangle, "t")

wn.listen()
wn.mainloop()





