#include<iostream>
using namespace std;

class Office 
{
	int empID;
	float Salary;
	
	public:
	Office(){
		empID=0;
		Salary=0;
	}

	void displayDetails(){
		cout<<"Customer ID is ="<<empID<<endl<<"Account Balance ="<<Salary<<endl; 
	}
	
	friend void insertDetails(Office &obj);
	
};
void insertDetails(Office &obj){
		obj.empID=20;
		obj.Salary=17000;
}

int main(){
	Office obj;
	obj.displayDetails();
	insertDetails(obj);
	obj.displayDetails();
	return 0;
}




#include <iostream>
class one {
private:
	int x;

public:
	one() { x = 8 ; }
	
	friend class two;
};

class two {
private:
	int y;

public:
	void displayone (one & a)
	{
		std::cout << "one 'x' = " << a.x;
	}
};

int main()
{
	one x;
	two y;
	y.displayone(x);
	return 0;
}
