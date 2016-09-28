# coding: utf-8

string = input(u"문자열 입력: ")

length = len(string)

if length % 2 == 0:
    print(string[length//2 -1], string[length//2])
else:
    print(string[length//2])


