# coding: utf-8

a = int(input(u"점수 입력"))

def score(a):
    if a <= 100 and a >= 90:
        print("A")
    elif a >= 80:
        print("B")
    elif a >= 70:
        print("C")
    elif a >= 60:
        print("D")
    elif a < 60:
        print("F")
    else:
        print(u"범위 초과")

score(a)
