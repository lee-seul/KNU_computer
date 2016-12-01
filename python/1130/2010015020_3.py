# coding: utf-8

from socket import *
svrsock = socket(AF_INET, SOCK_DGRAM)
svrsock.setsockopt(SOL_SOCKET, SO_REUSEADDR, 1)
svrsock.bind(('', 5001))               #로컬호스트에 5001포트로 바인딩
s, addr = svrsock.recvfrom(1024)
print s
print addr
svrsock.sendto('난 서버양!',addr)


from socket import *
csock = socket(AF_INET, SOCK_DGRAM)
csock.setsockopt(SOL_SOCKET, SO_REUSEADDR, 1)
csock.bind(('', 6001))
csock.sendto('난 클라이언트', ('127.0.0.1',5001)) # 대상 서버 , 목적지 포트
s, addr = csock.recvfrom(1024)
print s
print addr

