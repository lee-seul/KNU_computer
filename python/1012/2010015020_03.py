# coding: utf-8


with open("pro_3.txt", "w+") as f:
    for i in range(3):
        name = input(u"이름을 입력하시오 : ") 
        id_num = input(u"학번을 입력하시오: ")
        dep = input(u"학과를 입력하시오: ")
        score1 =  float(input(u"전공학점을 입력하시오: "))
        score2 =  float(input(u"교양학점을 입력하시오: "))
        result = (score1 + score2) / 2
        data = "이름 : {}, 학번 : {}. 학과 : {}, 전공학점 : {}. 교양학점 {}, 평균 학점 : {}".format( 
                name, id_num, dep, score1, score2, result)
        f.write(data + "\n")
    f.seek(0)
    print(f.read())


