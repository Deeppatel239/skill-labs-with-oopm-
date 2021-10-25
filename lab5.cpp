//To perform Operator Overloading using C++ for multiplying 2 complex numbers

#include <iostream>
using namespace std;
class Complex

{
	public:
	int real;
	int imag;
	
	Complex(){
		real=0;
		imag=0;
	}
	
	Complex(int r, int i)
	{
		real=r;
		imag=i;
	}
	
	Complex operator*(Complex c){
		double real1,real2;
		real1=real;
		real2=c.real;
		Complex ans;
		
		real=(real*c.real)-(imag*c.imag);
		imag=(real1*c.imag)+(imag*real2);
		
		//if (a,b)(c,d) then formula of multiplication is (ac-bd,ad+bc)
		
		ans.real=real;
		ans.imag=imag;
		return(ans);
	}
	
	void display()
	{
		cout<<real<<"*"<<imag<<"i"<<endl;
	}
	
};

int main()
{
	Complex c1(3,2);
	Complex c2(1,7);
	Complex c3;
	c3=c1*c2;
	c3.display();
}
