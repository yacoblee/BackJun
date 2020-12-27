package subject;

import java.util.Scanner;

public class Jung614 {

	public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	Sub s = new Sub();
	s.print1();
	s.school=sc.next();
	s.grade=sc.nextInt();
	s.print2();
	}

}

class Sub {
	String school;
	int grade;
	
	void print1() {
		this.school = "Jejuelementary ";
		this.grade = 6;
		
		System.out.println(grade+" grade in "+school+"School");
	}
	void print2() {
		System.out.println(grade+" grade in "+school+" School");
	}
}
