/*Write a C++ program to create an Employee class with data members: 
Employee number, Employee name, Basic, DA, IT, Net Salary class has 3 methods,
one method to get employee details for name, ID and basic salary
other method to calculate net salary using formula
	DA=1.32*basic;
	IT=0.30*(basic+DA);
	net_sal=(basic+DA)-IT; 
third method to print emp name, ID, net salary along with all salary components
Use the concept of array to enter data for minimum 3 Employees.*/

#include<iostream>
using namespace std;

class Employee
{
	public:
	int EmployeeNumber;
	float Basic, DA, IT, Salary;
	string EmployeeName;

	void get_details()             
	{
		cout<<"\nEnter Employee ID"<<endl;
		cin>>EmployeeNumber;
		cout<<"Enter Employee name "<<endl;
		cin>>EmployeeName;
		cout<<"Enter Employee Basic Salary"<<endl;
		cin>>Basic;
	}
	void calculate_details()       
	{
		DA=1.32*Basic;
		IT=0.30*(Basic+DA);
		Salary=(Basic+DA)-IT;	
	}
	void print_details()           
	{
		cout<<"\nEmployee Id :"<<EmployeeNumber<<endl;
		cout<<"Employee name : "<<EmployeeName<<endl;
		cout<<"Employee Basic Salary : "<<Basic<<endl;
		cout<<"Employee DA : "<<DA<<endl;
		cout<<"Employee IT : "<<IT<<endl;
		cout<<"Employee Salary : "<<Salary<<endl;
	}
};
   
    int main()
    {
    Employee E1[3];
    for(int i=0 ; i<3; i++)
    {
    	cout<<"Enter details of Employee: "<<i+1<<endl;
    	E1[i].get_details();
    	E1[i].calculate_details();
        E1[i].print_details();
        cout<<""<<endl;
	}
    return 0;
}
