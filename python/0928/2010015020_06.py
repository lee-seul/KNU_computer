# coding: utf-8

print(u"1. 원 넓이 계산하기\n \
        2. 사각형 넓이 계산하기\n \
        3. 삼각형 넓이 계산하기\n \
        4. 종료\n")

menu = int(input("메뉴를  선택하세요"))

if menu == 1:
    p = 3.14
    r = int(input(u"반지름 입력: "))
    if r < 0:
        print(u"음수")
    else:
        print(u"원 넓이 {}".format(p * r**2))
elif menu == 2:
    a = int(input(u"사각형 밑변: "))
    b = int(input(u"사각형 높이: "))
    if a < 0 or  b  < 0:
        print(u"음수")
    else:
        print(u"사각형 넓이 {}".format(a*b))
elif menu == 3:
    a = int(input(u"삼각형 밑변: "))
    b = int(input(u"삼각형 높이: ")) 
    if a < 0 or  b < 0:
        print(u"음수")
    else:
        print(u"삼각형 넓이 {}".format((a*b)/2))
elif menu == 4:
    print(u"종료")
else:
    print("Error")

