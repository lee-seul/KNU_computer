# coding: utf-8

num = int(input(u"1에서 9사이의 정수 1개를 입력하세요: "))

print(u"출력:")
if num > 9 or num < 1:
    print(u"잘못된 범위")
else:
    for i in range(1, num+1):
        for a in range(1, i+1):
            print(a, end="")
        for b in range(num-i, 0, -1):
            print("*", end="")
        print()

