class project
{
	int a=10;
	int b=20;
	String c="5%";
	void task()
	{
		int res=a+b;
		System.out.println(res*0.05);
	}

	public static void main(String[]args)
	{
		project p=new project();
		p.task();
	}
}	