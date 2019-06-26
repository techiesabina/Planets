public class Test
{
	private String name;
	private int age;

	public Test(String name, int age)
	{
		this.name = name;
		this.age = age;		
	}

	public String toString()
	{
		return "Hi! My name is " + this.name + ", and I'm " + age + " years old! #^3^# ";
	}	
	
	public static void main(String[] args)
	{	
		Test new = new Test("Bob Marley", 200);
		System.out.print.ln(new);
	}
}
