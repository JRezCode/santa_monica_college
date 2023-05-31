import random

def count_random_numbers(a,b,nsamples):
    d={}
    for i in range(nsamples):
        rand = random.randint(a,b)
        if rand in d:
            d[rand]+=1
        else:
            d[rand]=1
    return d
