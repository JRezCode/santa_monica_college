def add(m1,m2):
    matrix=[]
    for i in range(len(m1)):
        matrix.append([]*i)
    for i in range(len(matrix)):
        for j in range(len(m1[0])):
            matrix[i].append((j+1)*10**i)
    print(matrix)

m1=[[1,2,3],[4,5,6],[7,8,9]]
m2=[[1,1,1],[1,1,1],[1,1,1]]
add(m1,m2)
