class test
{
public void main(int a, int b)
	{
	System.out.println("The value of a is: "+a);
	System.out.println("The value of b is: "+b);
	}
public static void main(String[]args)
	{
	System.out.println("Hi Darling");
	test o=new test();
	o.main(4,5);
	main(3);
	main(10, 20, 5);
	main("Hai", "Darling");
	}
public static void main(int c)
	{
	System.out.println("The value of c is "+c);
	}
public static void main(int a, int b, int c)
	{
	int res= (a + b)*c;
	System.out.println("Sum of 'd' and 'e' is:	"+ res);
	}
public static void main(String a, String b)
	{
	String res= a + b;
	System.out.println("String values of 'a' and 'b' is:	"+ res);
	}
}