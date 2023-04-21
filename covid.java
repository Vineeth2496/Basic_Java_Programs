import java.util.Scanner;
class covid
{
	int a,b,c;

	void read()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value:");
	a=sc.nextInt();
	System.out.println("enter b value:");	
	b=sc.nextInt();
	System.out.println("enter c value:");	
	c=sc.nextInt();
	}
	void wave1()
	{
	int r1=a+b;
	System.out.println("sum value is:"+r1);
	}
	void wave2()
	{
	int r2=a-b;
	System.out.println("sub value is:"+r2);
	}
	void wave3()
	{
	int r3=(a+b)/c;
	System.out.println("Div value is:"+r3);
	}
	public static void main(String[]args)
	{
	covid v=new covid();
	v.read();
	v.wave1();
	v.wave2();
	v.wave3();

	}



}