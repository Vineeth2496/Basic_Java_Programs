class Palindrome
{
public static void main(String...args)
	{
	String original="madam", reverse="";
	for(int i=original.length()-1; i>=0; i--)
		{
		reverse=reverse + original.charAt(i);
		}
	if(original.equals(reverse))
		{
		System.out.println("Entered is palindrome: "+original);
		}
	else	{
		System.out.println("Entered is not palindrome: "+reverse);
		}
	}
}