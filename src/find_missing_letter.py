
def find_missing_letter(chars):

    for i in range(len(chars) - 1):
        if ord(chars[i]) - ord(chars[i + 1]) != -1:
            res = chr(ord(chars[i]) + 1)

    return res

