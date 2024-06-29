x1=[[1,2,3],[4,5,6]]
x2=[[1,1,1],[1,1,1]]


# Probably the easiest way is with append method acting on the list objects
# for independent rows in the 2-D matrix
def addappend(m1,m2):
    matrix=[]
    for i in range(len(m1)):
        matrix.append([])
        for j in range(len(m1[0])):
            matrix[i].append(m1[i][j]+m2[i][j])
    return matrix

# Another way may show a bit more under the hood of what is going in
# even though it may seem more difficult because it does not involve
# the use of no method calls

# Being careful to not make the mistake (confusing one) of copying the
# wrong way by making copies just to references/variables instead of new
# actual lists in memory     THIS IS WRONG: matrix=[[0]*len(m1[0])]*len(m1)

def addbuiltin(m1,m2):
    matrix=[]
    for i in range(len(m1)):
        matrix+=[[1]]
        for j in range(len(m1[0])-1):
            matrix[i]+=[1]

    # The process starts the same but rather than to append each additional
    # row/column dim to the matrix using a method it does this "procedure"
    # using a 2-dimensional element [[1]] that is then used to construct it. 

    # The need for augmented assignment for the concatentation operator is just an efficiency
    # The need for concatenating each list item in this way is a necessity of the
    # chosen procedure to be "building" NOT copying (which could cause problems with
    # references to the same list in memory)
    
    for row in range(len(matrix)):
        for col in range(len(matrix[0])):
            matrix[row][col]=m1[row][col] + m2[row][col]
    for r in matrix:
        print(r)
    return matrix


# A very complicated way of doing things that does
def addlength(m1,m2):
    for i in range(len(m1)):
        for j in range(len(m1[0])):
            list=list.append(m1[i][j]+m2[i][j])
    #now group the output from 1-D list into separate lists (matrix them)
    for values in range(len(m1)):
        row=list(range(list,len(m1[0])))

    print(list)
    #now construct the correct matrix with nxn rows and columns
    matrix=[[0]*len(m1[0])]*len(m1)

    #finally traverse through the matrix and insert the values in there
    i = 0
    while i < (len(matrix)):
        del matrix[i]
        matrix.insert(i,m1[i]+m2[i])
        i = i+1
    return matrix



#Second more elaborate way is to use the methods of remove and insert
def addb(m1,m2):
    matrix=[]
    for i in range(len(m1)):
 # This would be the way to build the 2-D structure while doing the rest of
 # the computational work
 #      matrix.append([])
 #      row=matrix[i]
        for j in range(len(m1[i])):
 # If uncommenting the previous code block for matrix.append 
            matrix.append(m1[i][j]+m2[i][j])
        #converting it to 2-D
#    for i range(len(m1[i])):
    return ans
    

#Another way is to use a while loop and for loop but it doesn't work
def add2(m1,m2):
    ans=[]
    rows=len(m1)
    cols=len(m1[0])
    while rows > 0:
        ans=ans.append([])
        for item in range(cols):
            ans[rows]=([m1[rows][item]+m2[rows][item]])
        rows = rows -1
#            ans[rows][item] =
    return ans

#Brute force building
def add3(m1,m2):
    list(m1)


addbuiltin(x1,x2)
