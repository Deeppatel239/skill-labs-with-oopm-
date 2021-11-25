package Interface;
import java.util.Scanner;

interface Management {
	void SelectCandidate();
}

interface Department {
	void allotSubject();
}

class HOD implements Management, Department {
	String Candidate;
	String Subject;
	
	void getdata() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Candidate's name: ");
		Candidate=in.next();
		
		System.out.println("Enter Subject: ");
		Subject=in.next();
	}
	 
	public void SelectCandidate() {
		System.out.println("Candidate Name is " + Candidate );
	}
	
	public void allotSubject() {
		System.out.println("Subject alloted is " + Subject );
	}
}

class Interface {
	public static void main (String[] args) {
		HOD m = new HOD();
		m.getdata();
		m.SelectCandidate();
		m.allotSubject();
	}
}
