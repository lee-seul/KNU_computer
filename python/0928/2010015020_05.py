# coding: utf-8

x1, y1 = map(int, input(u"점1의 좌표를 입력하세요").split())
x2, y2 = map(int, input(u"점2의 좌표를 입력하세요").split())

if x2 - x1 != 0:
    m = (y2 - y1)/(x2 - x1) 
    q = y1 - m * x1 
    print("{}x + {}".format(m, q))
else:
    print(u"x2 - x1 == 0 입니다.")

