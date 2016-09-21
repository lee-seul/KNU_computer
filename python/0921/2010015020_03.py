# coding: utf=8 

dic = {"1": u"파이썬이란 무엇인가?", "2": u"파이썬 프로그래밍 기초, 자료형", "3": u"제어문", "4": u"프로그래의 입력과 출력은 어떻게 해야할까?", "5": "파이썬 날개달기", "6" : u"어떻게 할것인가", "7": u"정규표현식"}

for key in dic.keys():
    print(key)

for value in dic.values():
    print(value)

for key in dic.keys():
    print(key, ":", dic[key])


