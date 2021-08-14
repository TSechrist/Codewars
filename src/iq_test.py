

def iq_test(numbers):

    lst = list(map(int, numbers.split(" ")))
    odd = 0
    odd += (lst[0] % 2)
    odd += (lst[1] % 2)
    odd += (lst[2] % 2)
    isOdd = odd > 1
    pos = 1

    for i in lst:
        if isOdd:
            if i % 2 == 0:
                return pos
        else:
            if i % 2 != 0:
                return pos
        pos += 1

    return pos