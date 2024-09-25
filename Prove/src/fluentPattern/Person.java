package fluentPattern;

class Person {
	
	 String name;
	 String position;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", position=" + position + "]";
	}
	
}	// person
		
class PersonBuilder {
		
		protected Person person = new Person();

		public PersonBuilder withName (String name) {
			person.name = name;
			return this;
		}
		
		public Person build() {
			return person;
		}
		
} // PeopleBuilder

class EmployeeBuilder extends PersonBuilder {
	
	EmployeeBuilder workAt (String position) {
		
		person.position = position;
		return this;
	}
	
} // EmployeeBuilder

