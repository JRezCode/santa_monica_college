#include <stdio.h>

/*
 * ID: 1654919
 * Student: Reznik, Jonathan
 * 
 * Thanks Dr. D for giving me a chance to do this assignment I think it
 * comes out very well.  The only thing that is missing is some handling
 * of incorrect input like character instead of number.  But you can actually
 * go ahead and try to type the wrong numbers like 5-9 in the menu and maybe
 * get a nice surprise, just have to learn to extend that to character type
 * next.  Although I am pretty sure that the scanf function is limited for
 * this purpose.  Take care,  :-)
 */

	int current_balance = 50;
	int amount;					//amount for deposit
	int MAX_ENTRIES = 3;
	int invalid_menu_entries;	//a variable counting invalid attempts and quits if too high

	int depositmoney(int bal, int dep);
	int withdraw(int bal, int withdrawal);

int main()
{
	int choice;		//menu driver for menu choice (could make sense to declare as pointer perhaps)
	
	while(invalid_menu_entries<MAX_ENTRIES){

	choice='\0';
	printf("Main Menu\n To (1) deposit, (2) withdraw, (3) view balance or (4) quit.\n");
	scanf("%d", &choice);					//printf("%d", choice);  //uncomment to check value of char

	//each menu option follows, and deposit or withdrawal require additional input to be taken
	if(choice==1)
	{
		printf("Deposit menu\n Enter amount to deposit?");
		scanf("%d", &amount);		//ask for amount of depos.
		current_balance = depositmoney(current_balance, amount);
		printf("Balance is now %d, following a deposit in the amount of %d.\n", current_balance, amount);
	}
	else if(choice==2)
	{
		printf("Withdrawal menu\n How much to withdraw? (enter now)\n");
		scanf("%d", &amount);		//ask for amount of withdr.
		current_balance = withdraw(current_balance, amount);
		printf("Balance is now %d, following withdrawal in the amout of %d.\n", current_balance, amount);
	}
	else if(choice==3)
	{
		printf("Your balance is %d.\n", current_balance);
	}
	else if(choice==4)
	{
		printf("Terminated");
		return 0;		//exits the program via user selection
	}
	else
	{
	//the default case is reserved for handling of incorrect input, which I did 
	//handle only for incorrect entries of type int.... highly suggest trying it with 5, 6, 7, 8 or 9, 0
		invalid_menu_entries++;

		if(invalid_menu_entries==MAX_ENTRIES)
			break;
		printf("invalid selection try again. Enter number 1-4 again.  You have ");
		if(invalid_menu_entries==MAX_ENTRIES-1)
			printf("1 more try.\n");
		else
			printf("%d more tries only.\n", (MAX_ENTRIES - invalid_menu_entries) );
	}
	
}	//end while
	
	printf("Program has terminated due to too many invalid entries");
	return 0;

}

//A black box function returns type int of balance and accepts balance and deposit input
int depositmoney(int bal, int dep){
	if(dep>10000 || dep<0)
	{
		//This error could be handled later in another iteration of programming
		printf("Rejected transaction\n");
		return bal;
	}
	bal+=dep;
	return bal;
}

//A black box function returns type int of balance and accepts balance and withdrawal input
int withdraw(int bal, int withdrawal){
	if(withdrawal<0 || (bal-withdrawal)<10)
	{
		//This error could be handled later in another iteration of programming
		printf("Rejected transaction\n");
		return bal;
	}
	bal-=withdrawal;
	return bal;
}
