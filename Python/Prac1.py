import csv

data= [
    ['hariom',32,56,78],
    ['aditya',45,45,87],
    ['om',45,455,12]
    ]

with open("C:\\Users\\Adi\\Downloads") as file:
    writer = csv.writer(file)
    writer.writerows(data)
print("Done")

with open("C:\\Users\\Adi\\Downloads") as file:
    reader = csv.reader(file)
    for row in reader:
        print(row)
