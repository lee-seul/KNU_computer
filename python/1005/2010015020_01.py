# coding: utf-8

def fmax(l):
    max_val = 0
    for n in l:
        if max_val < n:
            max_val = n
    return max_val

def fmin(l):
    min_val = fmax(l)
    for n in l:
        if min_val > n:
            min_val = n
    return min_val

def fmiddle(l):
    l.sort()
    return l[1]


def num_sort():
    while True:
        l = [int(x) for x in input().split()]
        if l[0] == 0 and l[1] == 0 and l[2] == 0:
            break;
        print(fmax(l), fmiddle(l), fmin(l))
    
num_sort()


