package pack2;

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
	if (index == jobs.length)
	{
		index=0;
		return false;
	}
	return true;
}
job nextjob()
{
	return jobs[index ++];
}
}
