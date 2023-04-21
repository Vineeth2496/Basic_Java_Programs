import java.util.Scanner;
	class cell
{
	int a,b,c;
	float d,e;
	void logic()
		{
		Scanner sr=new Scanner(System.in);
		System.out.println("enter a value:");
		a=sr.nextInt();
		System.out.println("enter b value:");
		b=sr.nextInt();
		System.out.println("enter c value:");
		c=sr.nextInt();
	/*	System.out.println("enter d value:");
		d=sr.nextfloat();
		System.out.println("enter e value:");
		e=sr.nextfloat();
	*/	
	}
	void task1()
		{
		int sum=a+b;
		System.out.println("Sum value:"+sum+"/-");
		}
	void task2()
		{
		int sub=a-b;
		System.out.println("Sub value:"+sub);
		}
	void task3()
		{
		int div=c/a;
		System.out.println("div value:"+div);
		}
	void task4()
		{
		boolean res1=a>b;
		System.out.println("true or false value:"+res1);
		}
	void task5()
		{
		boolean res2=a!=b;
		System.out.println("true or false value:"+res2);
		}

	public static void main(String[]args)
		{
		cell v=new cell();
		v.logic();
		v.task1();
		v.task2();
		v.task3();
		v.task4();
		v.task5();

		}

}
