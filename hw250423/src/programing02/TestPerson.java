package programing02;

public class TestPerson {
	public static void main(String[] args) {
		Person[] person = {
	            new Person("길동이", 22),
	            new Student("황진이", 23, 100),
	            new ForeignStudent("Amy", 30, 200, "U.S.A")
	        };

	        for (Person p : person)
	            System.out.println(p.show());
	}

}