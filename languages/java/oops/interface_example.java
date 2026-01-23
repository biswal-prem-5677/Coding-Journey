interface I1
{
	final int a=100;
	public void show();
	public static void demo()
	{
		System.out.println("I am static demo I1");
	}
	default void ddemo()
	{
		System.out.println("I am default demo");
	}

}
interface I2
{
	public static void demo()
	{
		System.out.println("I am static demo I2");
	}
	public void show();
	public void display();
	default void ddemo()
	{
		System.out.println("I am default demo");
	}
}
interface I3 extends I1,I2
{
		
}
class TestInterface implements I3
{
	public void display()
	{
		System.out.println("I am display");
	}
	public void show()
	{
		System.out.println("I am Show " + a);

	}
	public static void main(String arg[])
	{
		TestInterface t =new TestInterface ();	
		I1.demo();
		t.ddemo();	
	}

}