
import math as M
def nb_year(p0, percent, aug, p):

    res = 0

    while p0 < p:
        p0 = M.floor(p0 * (1 + (percent / 100))) + aug
        res += 1

    return res