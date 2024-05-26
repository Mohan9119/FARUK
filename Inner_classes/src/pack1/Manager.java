package pack1;

public class Manager {
	public static void main(String[] args) {
		job j1=new job("software ",50000);
		job j2=new job("hardware ",100000);
		job j3=new job("hr ",20000);
		job j4=new job("sales ",5000);
		job j5=new job("marketing ",6000);
		job[] jobs = {j1,j2,j3,j4,j5};
		Employee em =new Employee("vijay ",jobs);
		System.out.println("print first time");
		job currentjob;
		while (em.hashmorejobs())
		{
			currentjob = em.nextjob();
			System.out.println(currentjob.title+" : "+currentjob.salary);
		}
		System.out.println("print second time");
		while (em.hashmorejobs())
		{
			currentjob = em.nextjob();
			System.out.println(currentjob.title+" : "+currentjob.salary);
		}
		
	}
}
