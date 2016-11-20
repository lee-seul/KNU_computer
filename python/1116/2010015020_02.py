# coding: utf-8

from tkinter import *

def cal():
    l3.configure(text=str(e1.get())+ "=" + str(eval(e1.get())), bg="yellow")

wn = Tk()
f1 = Frame(wn)
f2 = Frame(wn)

wn.title("tk")
wn.geometry("400x400")

l1 = Label(f1, text="Operation")
l2 = Label(f1, text="Result")

e1 = Entry(f1, width=20)
l3 = Label(f1, text="")

bt = Button(f2, text="Calculating", command=cal)

l1.grid(row=0)
l2.grid(row=1)
e1.grid(row=0, column=1)
l3.grid(row=1, column=1)

bt.pack()

f1.grid(row=0)
f2.grid(row=1)

wn.mainloop()

