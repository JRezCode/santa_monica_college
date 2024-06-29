def diagonal(arg):
    dimension = len(arg)
    result=[]    
    for i in range(0,dimension):
        j=[]+arg[i]    
        result.append(j[i])
    return result
