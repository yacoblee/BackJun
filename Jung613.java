package subject;

import java.util.Scanner;

public class Jung613 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Multi m = new Multi();
		m.name=sc.next();
		m.school=sc.next();
		m.grade=sc.nextInt();
		m.print();

	}
//	String name,String school, int grade
}

class Multi {
	String name ;
	String school;
	int grade;
	
	void print() {
		System.out.println("Name : "+name);
		System.out.println("School : "+school);
		System.out.println("Grade : "+grade);
	}
}
