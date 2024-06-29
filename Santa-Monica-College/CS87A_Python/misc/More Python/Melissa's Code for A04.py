# Fun with function and matrix
#
m1 = [[3 , 5 , 9] , [5 , 7 , 1] , [9 , 1 , 5]]
m2 = [[3 , 5 , 10] , [5 , 0 , 6] , [10 , 7 , 1]]
m3 = [[0 , 0] , [0 , 0]]
m4 = [[0 , 0] , [1 , 0]]
m5 = [[1 , 2 , 3 , 4] , [5 , 6 , 7 , 8]]
m6 = [[1 , 2 , 3 , 4]]
m7 = [[1 , 2] , [3 , 4] , [5 , 6]]
m8 = [[1 , 2 , 3] , [4 , 5 , 6] , [7 , 8 , 9]]
m9 = [[1 , 2] , [3 , 4]]
m10 = [[1 , 2 , 3] , [4 , 5 , 6]]
#
# FUNCTION 1
# Diagonal of a matrix
#

def diagonal(matrix:list):
    print("[",end="")
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if i==j:
                print(matrix[i][j],end="")
                if j!=len(matrix[i])-1 and j>0:
                    print(", ",end="")
    print("]")
#
# FUNCTION 2    
# Check of symmetry of a matrix
#
def symmetric(matrix:list) -> bool:
    #check if matrix is square    
    if len(matrix)!=len(matrix[0]):
        print("Not square")
        return False
    #if a matrix is symmetric it' equal to its transposed matrix
    newMatrix = transpose(matrix)
    if newMatrix == matrix:
        return True
    else:
        return False
#
# FUNCTION 3    
# Transpose of a matrix
#
def transpose(matrix:list) -> list:
    returnedMatrix = []
    for i in range(len(matrix[0])):
        newLine = []
        for j in range(len(matrix)):
            newLine.append(matrix[j][i])
        returnedMatrix.append(newLine)
    return returnedMatrix
