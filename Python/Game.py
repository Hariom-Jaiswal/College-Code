import random

while True:
    print("\n")
    num1=int(input("Enter the Number: "))

    num2=random.randint(1,10)
    if num1==num2:
        print("You are Winner")
        break
    else:
        print("Looser")
        print("\n Computer: ",num2)
    
    print("========================================")