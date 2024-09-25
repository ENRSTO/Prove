package fluentPattern;


public class Demo {

	public static void main(String[] args) {

		EmployeeBuilder pb = new EmployeeBuilder();
		pb.withName("Rebecca");
		pb.workAt("Segretaria");
		System.out.println(pb.build().toString());
	}

}
