package pack1;

public class Employee {
String name;
job[]jobs;
private int index;
Employee(String name, job[]jobs)
{
	this.name=name;
	this.jobs=jobs;
}
boolean hashmorejobs()
{
	
	return index < jobs.length;
}
job nextjob()
{
	return jobs[index ++];
}
}
