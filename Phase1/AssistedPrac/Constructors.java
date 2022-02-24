package AssistedPracProj;

public class Constructors {

	public static void main(String[] args) {

		EmpInfo emp1 = new EmpInfo();
		EmpInfo emp2 = new EmpInfo();

		emp1.display();
		emp2.display();
		
		Para std1=new Para(2,"Abcd");
		Para std2=new Para(4,"Efgh");
		std1.display();
		std2.display();

	}
}

class EmpInfo {
	int id;
	String name;

	void display() {
		System.out.println(id + " " + name);
	}
}
class Para{
	int id;
	String name;

	Para(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}
