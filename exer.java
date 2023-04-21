	class exer
{
	int a=12;
	int b=13;
	float c=14.83f;
	float d=15.67f;
	

	void logic1()
	{
	int r1=a+b;
	System.out.println(r1);
	}
	void logic2()
	{
	boolean r2=a>b;
	System.out.println(r2);
	}
	void logic3()
	{
	boolean r3= c!=d;
	System.out.println(r3);

	}
	public static void main(String[]args)
	{
	exer l=new exer();
	l.logic1();
	l.logic2();
	l.logic3();
	String txt		="Hello World";
	String firstname	="Vineeth";
	String lastname		="Armoori";
	String q		="Good morning \"Hyderabad\"";
	System.out.println(q);
	System.out.println(firstname+ "Banti" +lastname);
	System.out.println(txt.toUpperCase());
	System.out.println(txt.toLowerCase());

	int i=0;
	while(i < 5)
	{
	System.out.println(i);
	i++;
	}

	}


}