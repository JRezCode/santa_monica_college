# change lower to upper case, and upper to lower case
def  print_opposite_case(sentence:str)->None:
#if first character of the string is upper case
    for letter in sentence:
        if letter.isupper():
            print(letter.lower(),end="")
        else:
            print(letter.upper(),end="")
def  get_changed_case(ch:str)->str:
    if ch.isupper():
        return ch.lower()
    else:
        return ch.upper()
while True:
    s = input("Enter a string  to  convert  case to upper  or  lower \(press  ’q’ to exit ):\n")
    if(s == 'q'):
        break
    
    print_opposite_case(s)
    print("\n")
print("Goodbye")
