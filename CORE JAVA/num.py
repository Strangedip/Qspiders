def num(a):
    if a<=0:
        return 0    
    num(a-1)
    print(a)

num(100)