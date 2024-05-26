package pack3;

public class Employee {
String name;
job[]jobs;
Employee(String name, job[]jobs)
{
	this.name=name;
	this.jobs=jobs;
}
Iterator getIterator()
{
	return new Iterator(jobs);
}
}
