

def tickets(people):
    a = 0
    b = 0

    for i in people:
        if i == 25:
            a += 1
        elif i == 50:
            if a > 0:
                a -= 1
                b += 1
            else:
                return "NO"
        else:
            if (a > 0) and (b > 0):
                a -= 1
                b -= 1
            elif a > 2:
                a -= 3
            else:
                return "NO"
    return "YES"
