public class calc
{
	int a=12;
	int b=20;
	float c=38.97f;
	float d=40.83f;
	void task1()
		{
		int x=a+b;
		System.out.println(x);
		}
	void task2()
		{
		int y=a-b;
		System.out.println(y);
		}
		
	void task3()
		{
		float z=d/c;
		System.out.println(z);
		}
	
	public static void main(String[]args)
		{
		calc m=new calc();
		m.task1();
		m.task2();
		m.task3();
		}
		
		
}