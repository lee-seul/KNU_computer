# coding: utf-8

year = int(input(u"연도를 입력하세요"))

if year % 400 == 0:
    print(u"윤년입니다")
else:
    if year % 4 == 0 and year % 100 != 0:
        print(u"윤년입니다")
    else:
        print(u"윤년이 아닙니다")

