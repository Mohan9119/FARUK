package pack3;

public class Iterator {
	private int index;
	job[]jobs;
	Iterator(job[]jobs)
	{
		this.jobs=jobs;
	}
	boolean hashMorejobs()
	{
		return index < jobs.length;
	}
	job nextjob()
	{
		return jobs[index++];
	}
}
