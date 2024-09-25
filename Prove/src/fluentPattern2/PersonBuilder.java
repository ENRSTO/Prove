package fluentPattern2;

public class PersonBuilder<T extends PersonBuilder<T>>{
	
	protected String name;
	
	public T setName(String name) {
        this.name = name;
        return (T) this;  // Restituisce 'T' per supportare una API fluida
    }
	
	public Person build() {
        return new Person(this);
    }

} // PersonBuilder

class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {
	private String position;
	
	public EmployeeBuilder setPosition(String position) {
		this.position = position;
		return this;
	}
	
	public String getPosition () {
		return position;
	}
	
} // EmployeeBuilder

class Person {
	
	private final String name;
	
	public Person(PersonBuilder<?> builder) {
		this.name = builder.name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}


