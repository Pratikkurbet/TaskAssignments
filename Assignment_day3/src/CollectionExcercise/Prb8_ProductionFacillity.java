package CollectionExcercise;

import java.time.LocalDate;

/*Consider following class :- class ProductionFacility {
int pliid; 
String pro_facility_name;
String pro_fa_location;
int totalproduction_perday;
String itemnames[];
LocalDate prod_date;
}
You have to perform following task.
a) Print the details of facility with highest production per day. (you have to 
add at least 3 days details of each facility after that you have to calculate 
average of 3 days on the basis of average you have to print the facility with 
highest production.
b) Print detail of facility on the basis of names.
c) Print which facility is producing highest item. 
d) Print production detail of each facility on the basis of production date*/

class ProductionFacility {
	int pliid;
	String pro_facility_name;
	String pro_fa_location;
	int totalproduction_perday;
	String itemnames[];
	LocalDate prod_date;
	public ProductionFacility(int pliid, String pro_facility_name, String pro_fa_location, int totalproduction_perday,
			String[] itemnames, LocalDate prod_date) {
		super();
		this.pliid = pliid;
		this.pro_facility_name = pro_facility_name;
		this.pro_fa_location = pro_fa_location;
		this.totalproduction_perday = totalproduction_perday;
		this.itemnames = itemnames;
		this.prod_date = prod_date;
	}
	public ProductionFacility() {
		super();
	}
	
}

public class Prb8_ProductionFacillity {

}
