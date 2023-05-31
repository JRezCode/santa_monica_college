#Double check this was one of 2 ways previously discussed
def addbyappend(m1,m2):
    matrix=[]
    for i in range(len(m1)):
        matrix.append([])
        for j in range(len(m1[0])):
            matrix[i].append(m1[i][j]+m2[i][j])
    return matrix

#And this is without append for a more brute force method...
def addbybruteforce(m1,m2):
    matrix=[]
    for i in range(len(m1)):
        matrix=matrix+[[]]
        matrix[i]+=[0]*len(m1[0])
        for j in range(len(m1[0])):
            matrix[i][j]+=(m1[i][j]+m2[i][j])
    return matrix        

def addbysclicecopy(m1,m2):
    matrix=[]
    matrix+=[[0]*len(m1[0])]
    for i in range(len(m1)-1):
        matrix.append(matrix[0][:])
    for row in range(len(m1)):
        for col in range(len(m1[0])):
            matrix[row][col]=m1[row][col] + m2[row][col]
    for r in matrix:
        print(r)
    return matrix

#Second more elaborate way is to use the methods of remove and insert
def addrows(m1,m2):
    matrix=[]
    for i in range(len(m1)):
        matrix.append([])
        row=matrix[i]
        for j in range(len(m1[i])):
            row.append(m1[i][j]+m2[i][j])
    return matrix
    

#Another brute force way of concatenating the lists into one and then reduce to the correct values in 1-d before revisiting 2-d
def add2din1d(m1,m2):
    result=list(m1+m2)
    for i in range(len(m1)):
        for j in range(len(m1[i])):
            result[i][j]=result[i][j]+result[i+len(m1)][j]
            del result[len(m1)]


#Another way is to use a while loop and for loop but it doesn't work
def addreverserow(m1,m2):
    ans=[]
    rows=len(m1)
    cols=len(m1[0])
    while rows > 0:
        ans=ans.append([])
        for item in range(cols):
            ans[0][item]=([m1[rows][item]+m2[rows][item]])
        rows = rows -1
    return ans

#Using file I/O in order to read and write the lines of code from various functions        
def readintoprog():
    fin=open(r'/home/jon/Developer/ClassExamProblemcs87av2.py','r')
    read = fin.read()
    fin.close()
    print(read)

def main():
    print("See some examples of how to build a m x n matrix at the same time as operating on the matrices")
    readintoprog()
    arg = input("Select the function to be used, 1) Brute force, 2)Append, 3)  5) Add matrix by initializing")
    
    if arg=='1':
        result=addbybruteforce(m1,m2)        
    elif arg=='2':
        result=addbyappend(m1,m2)
    elif arg=='3':
        creatematrix2(m1,m2)
        updatematrix(m1,m2)
    elif arg=='4':
        creatematrix1(m1,m2)
        updatematrix(m1,m2)
    elif arg=='5':
        addbyslicecopy(m1,m2)
    print("The code that was run was, ") 
    print(result)
        
m1=[[1,2,3],[4,5,6]]
m2=[[1,1,1],[1,1,1]]
main()
