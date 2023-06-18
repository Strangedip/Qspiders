def num1(a):
    if a<=0:
        return 0    
    num1(a-1)
    print(a)
num1(100)
print("Hard ended")

#OR

def num(a):
    if a<=100:
        print(a)    
        num(a+1)
num(1)
print("Easy ended")

