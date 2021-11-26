/*Write a C++ program to create an Employee class with data members: 
Employee number, Employee name, Basic, DA, IT, Net Salary class has 3 methods,
one method to get employee details for name, ID and basic salary
other method to calculate net salary using formula
	DA=1.32*basic;
	IT=0.30*(basic+DA);
	net_sal=(basic+DA)-IT; 
third method to print emp name, ID, net salary along with all salary components
Use the concept of array to enter data for minimum 3 Employees.*/

package extc1;
import java.util.Scanner;

public class employee {
    Scanner in = new Scanner(System.in);
    int EmployeeNumber;    
    String EmployeeName;
    double Basic, DA, IT, Salary;
    
    public employee() {
    }

    void get_details() {
        System.out.println("Enter the Id of Employee : ");
        EmployeeNumber = in.nextInt();
        System.out.println("Enter the name of Employee : ");
        EmployeeName = in.next();
        System.out.println("Enter the Basic Salary of Employee");
        Basic = in.nextFloat();
    }

    void calculate_details() {
        DA = 1.32 * (Basic);
        IT = 0.30 * (Basic + DA);
        Salary = (Basic + DA) - IT;
    }

    void print_details() {
        System.out.println("Employ Id" + EmployeeNumber);
        System.out.println("Employ name : " + EmployeeName);
        System.out.println("Employ Basic Salary : " + Basic);
        System.out.println("Employ DA : " + DA);
        System.out.println("Employ IT : " + IT);
        System.out.println("Employ Salary : " + Salary);
    }

    public static void main(String[] args) {
    	employee[] obj = new employee[2];
        for (int i = 0; i < 2; i++) {
        	System.out.println("Enter details of Employee:"+(i+1));
        	obj[i]= new employee();
            obj[i].get_details();
            obj[i].calculate_details();
        }
        for (int i = 0; i < 2; i++) {
        	obj[i].print_details();
        }
    }
}
