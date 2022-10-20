#
# Name : Jonathan Reznik
# SSID : 1654919
# Assignment #: 2
# Submission Date : 9/18/18
#

print ( " Welcome to the Santa Monica College CS87A \
        Quiz about the City of new york . \n Win by \
        answering all three questions correctly. " )

incorrect=0;

while (incorrect>=0):
    ans1=input("1. When did the city of new york incorporate \
        and become a city?\n a. 0 AD\n b. 1250 BCE\n c.1624\n \
        d.1623\n Enter your answer (a,b,c, or d): ")
    if (ans1=="c"):
        print ("You are really smart!\n\n")
    else:
        print ("Not so fast!  You'll need to do better. \n\n")

        incorrect=incorrect + 1

    ans2=input ( "2. How many people lived in New York as of \
        1999?\n a. 1 billion \n b. 1,250,000 \n c.7,428,000\n \
        d. 100 \n Enter your answer (a,b,c, or d): ")
    if (ans2=="c"):
        print ("You are really smart!\n\n")
    else:
        print ("Maybe true for some other place or time. \n\n")
        
        incorrect=incorrect + 1

    ans3=input ( "3. What was the number of people according to \
        the 2000 census in NY?\n a.25,000,000 \n b. 15,000\n c. \
        8,008,278\n d.14 trillion\n Enter answer (a,b,c, or d): ")
    if (ans3=="c"):
        print ("You are really smart!\n\n")
    if (incorrect==0):    #all questions were answered correctly
        exit(0);
    prompt=input("You missed some, would you like to try again? [Y/N]\n")
    if (prompt=="N"):
        exit(0);
    else:
        incorrect=0;       #reset

        print ("\n\n\nGood luck to you this time around :)\n\n")
