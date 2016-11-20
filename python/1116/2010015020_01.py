# coding: utf-8

from tkinter import *

def plus():
    l4.configure(text=str(float(e1.get()) + float(e2.get())), bg='red')

def minus():
    l4.configure(text=str(float(e1.get()) - float(e2.get())), bg='red')

def mul():
    l4.configure(text=str(float(e1.get()) * float(e2.get())), bg='red')

def div():
    l4.configure(text=str(float(e1.get()) / float(e2.get())), bg='red')


wn = Tk()
f1 = Frame(wn)
f2 = Frame(wn)

wn.title("tk")
wn.geometry("400x400")

l1 = Label(f1, text="Oprand1")
l2 = Label(f1, text="Oprand2")
l3 = Label(f1, text="result")
l4 = Label(f1, text="")

e1 = Entry(f1, width=20)
e2 = Entry(f1, width=20)

bt1 = Button(f2, text="+", command=plus)
bt2 = Button(f2, text="-", command=minus)
bt3 = Button(f2, text="*", command=mul)
bt4 = Button(f2, text="/", command=div)

l1.grid(row=0)
l2.grid(row=1)
e1.grid(row=0, column=1)
e2.grid(row=1, column=1)
l3.grid(row=0, column=2, rowspan=2)
l4.grid(row=0, column=3, rowspan=2)

bt1.grid(row=0, column=1)
bt2.grid(row=0, column=2)
bt3.grid(row=0, column=3)
bt4.grid(row=0, column=4)

f1.grid(row=0)
f2.grid(row=1)

wn.mainloop()


