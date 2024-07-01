#include <stdio.h>

int calcTripTime ( struct Trip * trip );

int main(void) {

	struct Trip {
		int total_trip_time;
		char * trip_dest;
		struct Leg {
			char * leg_dest;		//minutes
			int leg_time;
	} leg1, leg2;		
	} trip1, trip2;
	
	struct Trip * trip2Ptr;
	trip2Ptr = &trip2;
	struct Leg leg3 = addLeg(trip2Ptr, 400);
	//trip1.total_trip_time = calcTripTime(trip1);
					
	//printf("%d %d %d %d", leg1, leg2, leg3, leg4);

}

struct Leg addLeg (struct Trip * trip){
	struct Leg temp;
	temp.leg_time = 400;
	temp.leg_dest = 
}

int calcTripTime (struct Trip trip){
	int total = 0;
	for (int i = 0; i< trip.leg_count; i++) {
		total += trip.(leg+(i+1));
	}
	return total;
}
