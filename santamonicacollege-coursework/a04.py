#CS87A Assignment redone with 1 liners using list comprehension in Python
#Originally Done: 10/11/2018
#Updated: 10/11/2020

def diagonalX(matrix):
    return [[row[i] for row in matrix][i] for i in range(len(matrix))]

def transposeX(matrix):
    """This piece of code can be found here:
    https://scipython.com/book/chapter-4-the-core-python-language-ii/examples/the-matrix-transpose-by-list-comprehension/"""
    return [[row[i] for row in matrix] for i in range(len(matrix))]

def symmetricX(matrix):
    return not False in [[row[i] for row in matrix]==[col[i] for col in transposeX(matrix)] for i in range(len(matrix))]

def printmatriX(matrix,ID):
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
