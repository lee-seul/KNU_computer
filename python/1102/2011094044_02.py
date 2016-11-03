import random


play = True
while play :

    
    player = input("가위, 바위, 보 중에 하나를 입력하시오: ")
    player = player.lower()
    while (player != "바위" and player != "보" and player != "가위"):
        player = input("가위, 바위, 보 중에 하나를 입력하시오: ")
        player = player.lower()

    
    computer = random.randint(1,3)
    if (computer == 1):
        computer = "바위"
    elif (computer == 2):
        computer = "보"
    elif (computer == 3):
        computer = "가위"
    else:
        print ("Error.가위, 바위, 보 중에 하나를 입력하시오.")

   
    if (player == computer):
        print ("무승부 입니다")
    elif (player == "바위"):
        if (computer == "보"):
            print ("이겼습니다.");
        if (computer == "가위"):
            print ("졌습니다.");
    elif (player == "보"):
        if (computer == "바위"):
            print ("이겼습니다.");
        if (computer == "가위"):
            print ("졌습니다.");
    elif (player == "가위"):
        if (computer == "바위"):
            print ("졌습니다.");
        if (computer == "보"):
            print ("이겼습니다.");

    #restart
    userInput = input("포기? 예 or 아니오: ")
    userInput = userInput.lower()
    if (userInput == "예"):
            play = False
            print ("다음 기회에")
    else:
            play = True
    
