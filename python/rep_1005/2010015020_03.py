# coding: utf-8

year = input(u"연도를 입력하시오: ")
month = int(input(u"월을 입력하시오: "))
days = int(input(u"1일의 요일을 입력하시오(일: 0, 월: 1, ... , 토: 6): "))
print()

dic = {1 : 31, 2: 28, 3: 31, 4: 30, 5: 31, 6: 30, 7: 31, 8: 31, 9: 30, 10: 31, 11: 30, 12: 31}

print(u"            >>> {}년도 {}월 <<<             ".format(year, month))
print(u"    일    월    화    수    목    금    토")

day = 1
cnt = 0
while day <= dic[month]:
    if cnt < days:
        print("     ", end=" ")
        cnt += 1
        continue
    if day >= 10:
        print("    " + str(day), end="")
    else:
        print("    " + str(day), end=" ")
    day += 1
    cnt += 1
    if cnt % 7 == 0:
        print()

