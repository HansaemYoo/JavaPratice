package JavaPractice;

public class Person {
	
	//final ÇÊµå ¼±¾ð°ú ÃÊ±âÈ­
	final String nation = "Korea";
	final String ssn;
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	public static void main(String[] args) {

		Person p1 = new Person("123456-1234567", "È«±æµ¿");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name = "È«»ï¿ø";
		
	}

}
