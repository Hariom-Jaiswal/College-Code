count=0

list1=[]
print("To Stop press 'f'")
while True:
    num=input("\n Enter the Number: ")
    if num=='f':
        break
    else:
        list1.append(float(num))

sum=0
for i in list1:
    sum=sum+i
    if sum>=60:
        if i>0:
            j=60-i
        else:
            j=0
        sum=j
        count=count+1
    
print(f'Total Time: {count}hours {sum}mins')
    