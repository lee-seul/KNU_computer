# coding: utf-8

def tax(pay, total):
    val = 0
    if pay > 80000:
        val = int((pay-80000) * 0.36)
        total += val 
        tax(80000, total)
        print(u"\t\t\t\t{} * 0.36 = {:5}천원".format(pay - 80000, val))
    elif pay > 40000:
        val = int((pay-40000) * 0.27)
        total += val 
        tax(40000, total)
        print(u"\t\t\t\t{} * 0.27 = {:5}천원".format(pay - 40000, val))
    elif pay > 10000:
        val = int((pay-10000) * 0.18)
        total += val 
        tax(10000, total)
        print(u"\t\t\t\t{} * 0.18 = {:5}천원".format(pay - 10000, val))
    else:
        val = int(pay * 0.09)
        total += val
        print(u"\t\t\t\t{} * 0.09 = {:5}천원".format(pay, val))
    return total

pay = int(input(u"연봉을 입력하세요 (천원단위 입력): "))

while pay >= 0:
    print(u"연봉 {}만원에 대한 세금 계산".format(int(pay/10)))
    total = tax(pay, 0)
    print("\t\t\t\t-------------------------")
    print(u"\t\t\t\t\t합계 = {}천원".format(total))
    pay = int(input(u"연봉을 입력하세요 (천원단위 입력): "))


print(u"프로그램을 종료합니다.")

