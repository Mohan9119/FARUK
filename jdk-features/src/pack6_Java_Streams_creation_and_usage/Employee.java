package pack6_Java_Streams_creation_and_usage;

public class Employee 
{
	private String firstName;
	private Integer salary;
	public Employee(String firstName, Integer salary) {
		super();
		this.firstName = firstName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}
	public Integer getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", salary=" + salary + "]";
	}
	
	
}
