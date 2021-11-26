/*C++ program to input electricity unit charge and calculate the total electricity bill 
according to the given condition:
	For first 50 units Rs. 0.50/unit
	For next 100 units Rs. 0.75/unit
	For next 100 units Rs. 1.20/unit
	For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill*/

#include<iostream>

using namespace std;
int main()

{
	int units;
	float amount, totalamount, charge;
	cout<<"Enter the total number of units you consumed"<<endl;
	cin>>units;
 
  if(units<=50) {
	amount= (units*0.50);
    }
  else if (units<=150) {
	 amount= 25+ ((units-50) * 0.75);
    }
  else if (units <= 250) {
amount= 100+ ((units-15)*1.20);
    }
  else {
	amount=220 + ((units-250)*1.50);
    }

charge= amount* 0.20;
totalamount= amount+charge;

cout<<"\nYour Electricity bill = Rs. "<<totalamount;
return 0;
}
