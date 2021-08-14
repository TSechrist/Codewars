
def tribonacci(signature, n):
    lst = []
    a = signature[0]
    b = signature[1]
    c = signature[2]

    if n == 0:
        return lst
    if n > 0:
        lst.append(a)
    if n > 1:
        lst.append(b)
    if n > 2:
        lst.append(c)

    for i in range(n - 3):
        t = a + b + c
        lst.append(t)
        a = b
        b = c
        c = t

    return lst