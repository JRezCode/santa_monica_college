#Name: Jonathan Reznik
#StudentID: 1654919
#Assignment: A04
#Submitted: 10/11
#Description:  The program is able to handle three different routines that are performed on a matrix (a list of lists)
#Issues:  I went to the python documentation for some online help that was helpful...just for the final portion (transposing) which seemed to go
#       very far beyond my comfort level of working with for loops in order to traverse the multidimensional structure of lists within lists.
#       This subject is of interest to me and while I cited where it was that I sourced the concept/idea for the code within, it is also because of
#       an interesting subject to me (mathematical/programming/problem solving) something which I will likely continue to read more about, and learn other
#       ways to do from Python.  I am also very interested in the topic of formatting output with respect to the multidimensional matrices we are working with.

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

# This transpose solution is adapted from online documents at python.org where there is a tutorial on data structures that describes this way to transpose a matrix...
