#include <stdio.h>
#include <string.h>
//Structs demonstrations with arrays
struct flight {
		char destination_city[40];
		int one_way_cost;
		int round_trip_cost;
	};

typedef struct flight Flight;

int getSaving(struct flight * flst);
void changeAmount(struct flight * flite);

int main(void) {

	struct flight dest1 = { "Seattle", 150, 279};
	struct flight *f = &dest1;
	
	printf("My structure:  %s, One-Way: %d, Round-trip: %d",f->destination_city, f->one_way_cost, f->round_trip_cost); 
	printf("Cost savings for a round trip air fare are %d", getSaving(f));
	printf("Increased price by 100");
	changeAmount(f);
	printf("My structure:  %s, One-Way: %d, Round-trip: %d",f->destination_city, f->one_way_cost, f->round_trip_cost); 

}

int getSaving(struct flight *dest){
	return dest->one_way_cost * 2 - dest->round_trip_cost;
}

void changeAmount(struct flight * fl){
	fl->round_trip_cost += 100;
}
	/*struct Destination dest2 = { "New Jersey", "beach", 1200};
	struct Destination dest3 = { "Texas", "barcecue", 560};
	struct Destination dest4 = { "Florida", "nightclub", 1000};
	struct Destination dest5 = { "New York", "shows", 750};
	struct Destination dest6 = {"Hawaii", "surf", 1500};
	struct Destination dests[] = {dest1,dest2,dest3,dest4,dest5,dest6};*/
	
	int * trip_count;
	
	//int temp1 = getcost(dest1);
	//int temp3 = getcost(dest3);
	//int temp2 = getcostTotal(dests[], trip_count);
	
//	printf("It costs %d dollars to go to %s",temp1, dest1.city); 
//	printf("It costs %d dollars to go to %s",temp2, dest3.city); 
	//printf("It costs %d dollars to go to all %d cities",temp2, trip_count); 

/*int getcost(destination d)
{
	return d.trip_cost;
}
*/

/*int getcostTotal(struct Destination destination[], int *counts){
	int total = 0;
	int i = 5;
	while(i--){
		total+=destination[i].cost
		*counts++;
		}
		return total;
}
*/
