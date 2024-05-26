package pack6_sorting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/*
1, ramu, b, 22, r@r.com, 60000
2, vijay, m, 26, y@r.com, 90000
3, bhanu, p, 24, u@r.com, 40000
4, venu, a, 25, v@r.com, 50000
5, rekha, c, 28, a@r.com, 80000
6, mohan, r, 29, c@r.com, 70000
*/


class Employee
{
	private Integer id;
	private String firstName;
	private String LastName;
	private String email;
	private Integer age;
	private Integer salary;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", LastName=" + LastName + ", email=" + email
				+ ", age=" + age + ", salary=" + salary + "]";
	}
}

class SortEmployeeBasedOnId implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		return ((Employee)o1).getId() - ((Employee)o2).getId();
	}
}

class SortEmployeeBasedOnAge implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		return ((Employee)o1).getAge() - ((Employee)o2).getAge();
	}
}

class SortEmployeeBasedOnSalary implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		return ((Employee)o1).getSalary() - ((Employee)o2).getSalary();
	}
}

class SortEmployeeBasedOnFirstName implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		return ((Employee)o1).getFirstName().compareTo(((Employee)o2).getFirstName());
	}
}

class SortEmployeeBasedOnLastName implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		return ((Employee)o1).getLastName().compareTo(((Employee)o2).getLastName());
	}
}

class SortEmployeeBasedOnEmail implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		return ((Employee)o1).getEmail().compareTo(((Employee)o2).getEmail());
	}
}



public class M11 
{
	public static void main(String[] args) throws Exception
	{
		FileReader f1=new FileReader("emp.txt");
		BufferedReader bin =new BufferedReader(f1);
		ArrayList employees =new ArrayList();
		Employee employee;
		String id, firstName, lastName, email, age, salary, record;
		int fromIndex =0,toIndex;
		while((record=bin.readLine()) !=null)
		{
			toIndex=record.indexOf(",");
			id =record.substring(fromIndex, toIndex);
			
			fromIndex =toIndex +1;
			toIndex=record.indexOf(',', fromIndex);
			firstName = record.substring(fromIndex, toIndex);
			
			fromIndex =toIndex +1;
			toIndex=record.indexOf(',', fromIndex);
			lastName = record.substring(fromIndex, toIndex);
			
			fromIndex =toIndex +1;
			toIndex=record.indexOf(',', fromIndex);
			email = record.substring(fromIndex, toIndex);
			
			fromIndex = toIndex + 1;
			toIndex = record.indexOf(',', fromIndex);
			age = record.substring(fromIndex, toIndex);
			
			fromIndex =toIndex +1;
			salary = record.substring(fromIndex);
			
			employee =new Employee();
			employee.setId(Integer.parseInt(id.trim()));
			employee.setFirstName(firstName.trim());
			employee.setLastName(lastName.trim());
			employee.setEmail(email.trim());
			employee.setAge(Integer.parseInt(age.trim()));
			employee.setSalary(Integer.parseInt(salary.trim()));
			
			
			employees.add(employee);
			fromIndex =0;
		}
		System.out.println(employees);
		Scanner sc =new Scanner(System.in);
		String action;
		
		do
		{
			System.out.println("while file should be considered for sorting ");
			action=sc.next();
			Comparator c1 =null;
			if("id".equals(action))
			{
				c1 =new SortEmployeeBasedOnId();
			}
			
			if("firstname".equals(action))
			{
				c1 =new SortEmployeeBasedOnFirstName();
			}
			
			if("lastname".equals(action))
			{
				c1 =new SortEmployeeBasedOnLastName();
			}
			
			if("email".equals(action))
			{
				c1 =new SortEmployeeBasedOnEmail();
			}
			
			if("age".equals(action))
			{
				c1 =new SortEmployeeBasedOnAge();
			}
			
			if("salary".equals(action))
			{
				c1 =new SortEmployeeBasedOnSalary();
			}
			
			Collections.sort(employees,c1);
			System.out.println(employees);
			System.out.println("do you want to sort again(y/n)?");
		}
		while("y".contentEquals(sc.next()));
	}
}
