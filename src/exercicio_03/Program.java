package exercicio_03;

import java.util.Locale;
import java.util.Scanner;

import actors.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Student st = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter student name: ");
		st.name = sc.nextLine();
		System.out.println("Enter quarter grades");
		System.out.print("G1: ");
		st.g1 = sc.nextDouble();sc.nextLine();
		System.out.print("G2: ");
		st.g2 = sc.nextDouble();sc.nextLine();
		System.out.print("G3: ");
		st.g3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n",st.increaseGrade());
		if (st.increaseGrade()<60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", st.missingPoints());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
