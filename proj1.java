import java.util.Scanner;
class proj1
{
    int a,b,c;

      void task()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		a=sc.nextInt();
		System.out.println("enter b value:");
		b=sc.nextInt();
		System.out.println("enter c value:");
		c=sc.nextInt();
	} 
	void task4()
	{
		int r3=(a++ + b--);
		System.out.println("sum value is:"+r3);
	}

	void task1()
	{
	     int sum=(++a + --b);
	     System.out.println("sum value is:"+sum);  // + = concatnation
	}

	void task2()
	{
	     int r1=(--a + --b);
	     System.out.println("sum value is:"+r1);  // + = concatnation
	}
	void task3()
	{
	     int r2=(++a + --b);
	     System.out.println("sum value is:"+r2);  // + = concatnation
	}


	public static void main(String[]args)
	{
		proj1 p=new proj1();
		p.task4();
		p.task();
		p.task1();
		p.task2();
		p.task3();

	}


}