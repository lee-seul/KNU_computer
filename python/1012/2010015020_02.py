# coding: utf-8

with open("pro_2.txt", "w+") as f:
    for i in range(5):
        data = input(u"문자열 입력: ")
        f.write(data + "\n")
    f.seek(0)
    print(f.read())


