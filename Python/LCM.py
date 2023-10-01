def calculatelcm(x, y):
    if x > y:
        greater = x
    else:
        greater = y

    while(True):
        if((greater % x == 0) and (greater % y == 0)):
            lcm = greater
            break
        greater +=1
    return lcm

print("Enter The First Number")
num1 = int(input())

print("Enter The Second Number")
num2 = int(input())

print("The L.C.M of two numbers are ", calculatelcm(num1,num2))