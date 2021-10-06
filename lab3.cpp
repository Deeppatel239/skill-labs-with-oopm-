/*create a class student with two method getdata() and printdata().
getdata() to get the value from the user and display the data in printdata().
create the two object s1,s2 to declare and access the values from studenttest.*/

#include<iostream>
using namespace std;

class student{
	public:
	int rollnum;
	float cgpa;
	string branch,name;
	char div;
	

	int getdata()
	{
		cout<<"\nEnter your Name: ";
		cin>>name;
		
		cout<<"Enter your Roll no: ";
		cin>>rollnum;
		
		cout<<"Enter your Division: ";
		cin>>div;
		
		cout<<"Enter your Branch: ";
		cin>>branch;
		
		cout<<"Enter your CGPA:";
		cin>>cgpa;
	}

	int displaydata()
	{
		cout<<"\nStudent Information"<<endl;
		cout<<"The name is: "<<name<<endl;
		cout<<"The Roll no is: "<<rollnum<<endl;
		cout<<"The Division is: "<<div<<endl;
		cout<<"The Branch is: "<<branch<<endl;
		cout<<"The CGPA is: "<<cgpa<<endl;
	}
};

int main()
{
	student s1,s2;
	s1.getdata();
	s1.displaydata();
	s2.getdata();
	s2.displaydata();
}
