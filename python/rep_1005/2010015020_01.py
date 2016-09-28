# coding: utf-8


for a in range(5, 0, -1):
    for b in range(1, 9):
        if a > 2 and b > 6:
            continue;
        print(str(a) + "0" + str(b), end=" ")
    print()

