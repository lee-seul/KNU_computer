# cdoing: utf-8

with open("pro_1.txt", "w+") as f:
    for i in range(1, 10):
        for j in range(1, 10):
            result = i * j
            data = "{} * {} = {}    ".format(i, j, result)
            f.write(data)
        f.write("\n")
    f.seek(0)
    print(f.read())


