class AriTest 
{
	public static void main(String[] args) 
	{
		/*
		byte b1 = 127;
		b1++;
		System.out.println("b1 = " + b1);
		*/

		int a1 = 10;
		int a2 = 20;
		int a = a1++;
		System.out.print("a = " + a);
		System.out.println("a1 = " + a1);
		a = ++a1;
		System.out.print("a="+a);
		System.out.println("a1="+a1);
		a = a2--;
		System.out.print("a="+a);
		System.out.println("a2="+a2);
		a = --a2;
		System.out.print("a="+a);
		System.out.println("a2="+a2);

	}
}
