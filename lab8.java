//Program 1 

package inheritance;
import java.util.Scanner;

class person
{
	String name, address;
	int age;
	Scanner in = new Scanner(System.in);
	void display()
	{
		System.out.println("***Details of the Programmer***");
		System.out.println("\nEnter your name :");
		name=in.next();
		System.out.println("Enter your age :");
		age=in.nextInt();
		System.out.println("Enter your address :");
		address=in.next();
	}	
}

class employee extends person
{
	int empid;
	float salary=15000 ;
	Scanner in= new Scanner(System.in);
	void getdata()
	{
		System.out.println("Employee ID is :");
		empid=in.nextInt();
	}
	
	void getsalary()
	{
		System.out.println("The Base Salary is :" +salary);
	}
}

class programmer extends employee
{
	Scanner in = new Scanner(System.in);
	String Profession;
	double hike=0.5 ;
	void printdata()
	{
		System.out.println("Technical Background : ");
		Profession=in.next();
	}
	
	void hikesalary() 
	{
		super.getsalary();
		System.out.println("\nSalary after increment is : " +(salary+(salary*hike)) );
	}
}
class Multilevel_inheitence
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     employee emp = new employee();
     programmer p = new programmer();
     emp.display();
     emp.getdata();
     p.printdata();
     p.hikesalary();
	}
}





//program 2

package inheritance;

class employee
{
	float salary = 40000;
	void display()
	{
		System.out.println("\n\nThe Basic Salary is:" + salary);
	}
}

class Permanentemp extends employee
{
	double hike = 0.8;
	
	void incrementsalary()
	{
		super.display();
		System.out.println("\nSalary of Permanent employee after increment is:" + (salary+(salary *hike)) );
	}
}

class Temporaryemp extends employee
{
	double hike = 0.25;
	
	void incrementsalary()
	{
		System.out.println("");
		System.out.println("\nSalary of Temporary employee after increment is:" + (salary+(salary *hike)) );
	}
}

class Hierarchical_inheritance 
{
	public static void main(String args[])
	{
		Permanentemp per = new Permanentemp();
		Temporaryemp temp = new Temporaryemp();
		per.incrementsalary();
		temp.incrementsalary();
	}
}
