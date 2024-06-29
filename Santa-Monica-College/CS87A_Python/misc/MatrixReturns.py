#Symmetry test
def symmetrical(x):
    mismatch=0
    for i in range(0,len(x[0])):
        for j in range(0,len(x)):
            if(x[i][j]!=x[j][i]):
                mismatch+=1
    return(mismatch==0)            

#Diagonal return
def get_diagonal(x):
    diag = []
    for i in range(0,len(x)):
        diag.append(x[i][i])
    return diag

###Print a matrix nicely
def showmatrix(matrix):
    print('\n'.join([' '.join([str(cell) for cell in row]) for row in matrix]))

