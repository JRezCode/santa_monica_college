#
# Name : Jonathan Reznik
# SSID : 1654919
# Assignment
#: 3
# Submission Date : 9/30/18
#
# Description of program :
#
#   Making use of the builtin functions ord() and chr() to
#   work with ASCII table and write function call to convert
#   upper to lower and lower to upper in get_changed_case method.
#   The method at the end runs a continuous loop to allow for
#   repeated occurrences/trials of the program continuously.
#

def print_opposite_case(sentence:str)->None:
    for ch in sentence:            
        print(get_changed_case(ch),end="")


def get_changed_case(ch:str)->str:
    if(65<=ord(ch)<=90):
        return chr(ord(ch)+32);
    elif(97<=ord(ch)<=122):
        return chr(ord(ch)-32);
    else:
        return(ch);
        
while True:

    s = input("Enter a string to convert case to upper or lower (press 'q' to exit):\n")

    if (s=='q'):
        break

    print_opposite_case(s)
    print("\n")

print("Goodbye")
