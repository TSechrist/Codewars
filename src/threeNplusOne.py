def threeNplusOne(n):
    cur = n
    res = [n]

    while cur > 2:
        cur = process(cur)
        res.append(cur)

    return res


def process(num):
    if (num % 2) == 0:
        return int(num / 2)
    else:
        return num * 3 + 1


def maxArr(arr):
    m = [0, arr[0]]

    for i in range(len(arr)):
        if arr[i] > m[1]:
            m[0] = i
            m[1] = arr[i]

    return m


# length = []
# for i in range(3, 1000000):
#     length.append(len(threeNplusOne(i)))
#
# print(maxArr(length))

print(threeNplusOne(837796))