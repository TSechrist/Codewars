

def count_bits(n):

    count = 0
    binary = bin(n).replace("0b", "")

    print(bin(n))

    for i in range(len(binary)):
        if binary[i] == '1':
            count += 1

    return count