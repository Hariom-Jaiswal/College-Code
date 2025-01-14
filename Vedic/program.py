from turtle import left


def Linear():
    print("\nLinear")

    array = [1,9,8,2,3,4,5]
    target=int(input("Enter The Target: "))

    for i in range(len(array)):
        if(target==i):
            print("Target Found yayayayaya at index",i)
            return

    print("No Match Found")


##############################################
def Binary():
    print("\nBinary")

    array=[1,2,3,4,5,6,7,8,9]
    target=int(input("Enter The Target: "))

    l=0
    h=len(array)-1

    while l<=h:
        m=(l+h)//2
        print(l,'-----',h)
        if target==array[m]:   
            print("Target Found")
            return
        
        elif target<array[m]:
            h=m-1

        elif target>array[m]:
            l=m+1

    print("No Match Found")

#####################################
def Bubble():
    print("Bubble")

    array=[1,4,5,8,9,6,7]
    length= len(array)

    for p in range(1,length-1):
        for c in range(0,length-p):
            if array[c]>array[c+1]:
                aa=array[c]
                array[c]=array[c+1]
                array[c+1]=aa

    print(array)

##########################################


