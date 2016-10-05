# coding: utf-8

def plus(a,b):
    return a + b

def minus(a, b):
    return a - b

def mul(a, b):
    return a * b

def mo(a, b):
    return a / b

def menu():
    print("****************************************")
    print(u"    1.  덧셈                           *") 
    print(u"    2.  뺄셈                           *") 
    print(u"    3.  곱셈                           *") 
    print(u"    4.  나눗셈                         *") 
    print(u"    5.  종료                           *")
    print("****************************************")
    
while True:
    menu()
    n = int(input(u"메뉴를 선택하세요: "))
    if n != 5:
        a, b = map(int, input(u"두 수를 입력하세요: ").split())
        if n == 1:
            print(plus(a, b))
        elif n == 2:
            print(minus(a, b))
        elif n == 3:
            print(mul(a, b))
        elif n == 4:
            print(mo(a, b))
        else:
            print(u"값 오류")
    elif n == 5:
        break
