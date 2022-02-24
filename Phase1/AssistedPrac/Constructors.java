package AssistedPracProj;

public class Constructors {

	public static void main(String[] args) {

		EmpInfo emp1 = new EmpInfo();
		emp1.display();

		Para std1 = new Para(2, "Abcd");
		std1.display();

	}
}

class EmpInfo {
	int id = 10;
	String name;

	void display() {
		System.out.println(id + " " + name);
	}
}

class Para {
	int id;
	String name;

	Para(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}
}
