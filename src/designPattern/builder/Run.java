package designPattern.builder;


public class Run {
	
	public static void main(String[] args) {
		person person = new person.Builder("Kim")
                .age(25)
                .country("Korea")
                .gender("Man")
                .job("developer")
                .build();
		
		person person1 = new person.Builder("Park")
                .age(25)
                .country("Korea")
                .gender("Man")
                .job("Student")
                .build();
		
		System.out.println(person);
		System.out.println(person1);
	}
}
