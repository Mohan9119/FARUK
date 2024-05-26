package pack6_Java_Streams_creation_and_usage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class M12 
{
	public static void main(String[] args) {
		List<Employee> employees= new ArrayList<Employee>();
		employees.add(new Employee("abc",60000));
		employees.add(new Employee("xyz",50000));
		employees.add(new Employee("core",40000));
		employees.add(new Employee("java",30000));
		employees.add(new Employee("check",20000));
		employees.add(new Employee("test",10000));
		employees.add(new Employee("hello",50000));
		
		List<Employee> r1=employees.stream().sorted((emp1,emp2)->emp1.getFirstName().compareTo(emp2.getFirstName())).collect(Collectors.toList());
		System.out.println(r1);
		
		List<Employee> r2=employees.stream().sorted((emp1,emp2)->emp1.getSalary().compareTo(emp2.getSalary())).collect(Collectors.toList());
		System.out.println(r2);
	}
}
