class Mainclass 
{
	int a;
	String name;
	Mainclass(int a)
	{
		this.a=a;
	}
	Mainclass(String name)
	{
		this.name=name;
	}
	Mainclass(String name, int a)
	{
		this.name=name;
		this.a=a;
	}
	Mainclass(int a, String name)
	{
		this.a=a;
		this.name=name;
	}
	public static void main(String[] args) 
	{
		Mainclass m=new Mainclass(10);
		Mainclass m2=new Mainclass(10, "ABC");
		Mainclass m3=new Mainclass("ABC");
		Mainclass m4=new Mainclass("ABC",20);

	}
}
