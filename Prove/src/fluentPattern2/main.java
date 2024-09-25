package fluentPattern2;

public class main {

	public static void main(String[] args) {

		EmployeeBuilder eb = new EmployeeBuilder().setName("enrsto").setPosition("Ing");
		System.out.println(eb.build());
		System.out.println(eb.getPosition());
		
	}

}
