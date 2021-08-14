
from fractions import Fraction
import math

def decompose(n):

    lst = []
    count = 0

    if Fraction(n) > 1:
        lst.append(str(math.floor(Fraction(n).numerator / Fraction(n).denominator)))
        num = Fraction(n) - math.floor(Fraction(n).numerator / Fraction(n).denominator)
    else:
        num = Fraction(n)

    while num > 0:
        count += 1
        if (num - Fraction(1, count)) >= 0:
            num -= Fraction(1, count)
            lst.append("/".join(["1", str(count)]))

    return lst