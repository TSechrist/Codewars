

def filter_list(l):

    lst = []
    for i in range(len(l)):
        if type(l[i]) == int:
            lst.append(l[i])

    return lst
