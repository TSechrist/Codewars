

def first_non_repeating_letter(string):

    lst = []
    lstDup = []

    for c in list(string):
        if str.lower(c) not in lst:
            lst.append(str.lower(c))
        else:
            lstDup.append(str.lower(c))

    for c in list(string):
        if str.lower(c) not in lstDup:
            return c

    return ''