import MatrixReturns
import MatrixOperators

#Make changes to the matrix values
def changematrix(matrix):
    print("Select from the menu of possible alterations to the matrix values")
    #Insert a menu that provides for some possible other options
    cont=""
    while(cont!='y'):
        i=int(input("Which row would you like to change? Just make sure values are between 1 and " + str(len(matrix))))
        j=int(input("Which column would you like to change? Just make sure values are between 1 and " + str(len(matrix[i]))))
        matrix[i-1][j-1]=int(input("Change " + str(matrix[i-1][j-1]) + "?  What should the new value be?"))
        print(matrix)

#Create a blank matrix with user input taken
M=matrix=m=[101]
dimension=input("RowxColumn:")
dimensional_array=dimension.split('x',1)
rows=int(dimensional_array[0])
cols=int(dimensional_array[1])
makerow=0
makecol=10
m*=rows
print("constructing a structure to house 2-D MATRIX")
for i in range(rows):
    m[i]=[0]*cols
while(makerow<rows):
    print(makerow,"->",m[makerow])
    makerow+=1
print("Now filling in diagonals to create Identity Matrix")
MatrixOperators.set_diagonal(M,1)
MatrixReturns.showmatrix(M)
