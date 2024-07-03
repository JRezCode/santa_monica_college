# Name: Jonathan Reznik
# StudentID: 1654919
# Assignment: A04
# Submitted: 10/11
# Description:  Operations on a matrix (a list of lists)
# Additional Notes: Formatting output of multidimensional matrices

def diagonal(arg):
    dimension = len(arg)
    result=[]    
    for i in range(0,dimension):
        j=[]+arg[i]
        result.append(j[i])
    return result

def symmetric(arg):
    mismatch=0
    for i in range(0,len(arg)):
        for j in range(0,len(arg)):
            if (arg[i][j]!=arg[j][i]):
                mismatch+=1
    return (mismatch==0)

def transpose(arg):
    newmatrix=[]
    for i in range(len(arg[0])):
        newmatrixrow=[]
        for j in arg:
             newmatrixrow.append(j[i])
        newmatrix.append(newmatrixrow)
    print(newmatrix)
