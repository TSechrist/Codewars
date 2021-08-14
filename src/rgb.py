

def rgb(r, g, b):
    res = ""

    if r < 0:
        r = 0
    if g < 0:
        g = 0
    if b < 0:
        b = 0
    if r > 255:
        r = 255
    if g > 255:
        g = 255
    if b > 255:
        b = 255

    print(hex(1))

    res += hex(r)[2:] + hex(g)[2:] + hex(b)[2:]

    return str(res).upper()