###Swap rows
def row_exchange(x,row1,row2):
    copy=x[row1]
    x[row1]=x[row2]
    x[row2]=copy

###Diagonal set
def set_diagonal(x,diag):
    #diag = input("Please enter a new value for the diagonals: ")
    for i in range(len(x)):
        x[i][i]=diag
    return(x)

###Transpose

