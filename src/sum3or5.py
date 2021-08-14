
def sum3or5(number):

    if number < 1:
        return 0

    res = 0
    for i in range(number):
        if i % 3 == 0 or i % 5 == 0:
            res += i

    return res