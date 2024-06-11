count = 0
x = 0
y = 1
new_number = x

while count <= 10:
    print(new_number, end=', ')
    x, y = y, new_number
    new_number = x + y

    count += 1