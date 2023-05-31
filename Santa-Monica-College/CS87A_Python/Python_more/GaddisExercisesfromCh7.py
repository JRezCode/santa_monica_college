# A list
list5digs=[1,2,3,4,5]
list5word=["one","two","three"]

#Algorithm Workbench Chapter 7
#2. Write a function that accepts a list as an argument and calculates the sum of each ele- ment of the list.
def sum(li):
    result=0
    for i in li:
        result+=li[i-1]
    return result

#3. 
