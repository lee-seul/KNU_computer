# coding: utf-8

anwser = ord("q")

count = 0
while True:
    count += 1
    s = ord(input(u"알파벳 맞추기: "))
    if anwser < s:
        print(u"입력한 문자의 아스키 코드값이 더 큽니다.")
    elif anwser == s:
        print(u"알파벳 맞추기 축하합니다. 정답입니다.")
        print(u"시도 획수 {}번".format(count))
        break;
    else:
        print(u"입력한문자의 아스키 코드값이 작습니다.")


