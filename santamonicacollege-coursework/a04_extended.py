# matrices_with_list_comprehensions.py

# CS87A Santa Monica College intro to Python course
# 
# This assignment I chose to rework after the face in order to include Python's
# list comprehensions, which I got the idea from viewing a solution to the 
# transpose code, see below. That gave me the idea to complete similar 
# comprehensions for other matrix computations.  


def transposeX(matrix):
    # A one-line solution for matrix diagonal
    #Source: https://scipython.com/book/chapter-4-the-core-python-language-ii/examples/the-matrix-transpose-by-list-comprehension/ 
    return [[row[i] for row in matrix] for i in range(len(matrix))]

def diagonalX(matrix):
    # The diagonal adds a index for [i] at each row[i], in effect row[i][i]
    return [[row[i] for row in matrix][i] for i in range(len(matrix))]

def symmetricX(matrix):
    # The symmetry results if no False appears in comparison of rows and cols
    # from the matrix and its transpose which are in a nested list.
    return not False in [[row[i] for row in matrix]==[col[i] for col in transposeX(matrix)] for i in range(len(matrix))]

def printmatriX(matrix,ID):
    # It is of course once again done with nested lists, and return handles 
    # several calls to separate print() statements
    return  print("----MATRIX-"+ID+"----",end=""),[[print(),[print(col, end=" ") for col in row]] for row in matrix],print()
    

def main():
    m1=[[1,2,3],[4,5,6],[7,8,9]]
    m2=[[1,2,3],[2,1,2],[3,2,1]]
    m3=[[1,1,1],[1,5,6],[1,8,9]]

    printmatriX(m1,"1")
    printmatriX(transposeX(m1),"1T")
    print("Diagonal: ",diagonalX(m1))
    print("Symmetry: ",symmetricX(m1))
    print()
    printmatriX(m2,"2")
    printmatriX(transposeX(m2),"2T")
    print("Diagonal: ",diagonalX(m2))
    print("Symmetry: ",symmetricX(m2))
    print()
    printmatriX(m3,"2")
    printmatriX(transposeX(m3),"2T")
    print("Diagonal: ",diagonalX(m3))
    print("Symmetry: ",symmetricX(m3))

main()
