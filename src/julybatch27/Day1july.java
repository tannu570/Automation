package julybatch27;

public class Day1july {
	int age;
	int rollno;

	public static void Display1() {
		System.out.println("Welcome to all of you");
	}

	public static void Display2() {
		System.out.println("Automation is very easy");
	}

	public static void main(String[] args) {
		Day1july day1 = new Day1july();
		day1.Display1();
		day1.Display2();
		day1.age = 15;
		day1.rollno = 25;
		System.out.println("Student age is " + day1.age);
		System.out.println("Student roll No. is " + day1.rollno);
	}
}
