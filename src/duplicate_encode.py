
def duplicate_encode(word):

    lst = []
    lstDup = []
    res = ""

    for c in list(word):
        if str.lower(c) not in lst:
            lst.append(str.lower(c))
        else:
            lstDup.append(str.lower(c))

    for i in range(len(word)):
        if str.lower(word[i]) in lstDup:
            res += ")"
        else:
            res += "("

    return res