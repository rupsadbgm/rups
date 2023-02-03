import java.util.Scanner;
class Practise1
{
	String name;
	String email;
    long ph;
	String pwd;
public static void main(String[] args) 
	{
	Practise1 p=new Practise1();
	Scanner d=new Scanner(System.in);
	System.out.println("Rupesh's restaurant");
	System.out.println("1.Sign-up");
	System.out.println("2.login");
	System.out.println("3.Menu");
	System.out.println("4.Total Bill");
	System.out.println("Please select the option");
   int option=d.nextInt();
   switch (option)
   {
   case 1:
	   {
		p.signup();
		break;
	   }
	   case 2:
	   {
		p.login();
		break;
	   }
	   case 3:
	   {
		p.menu();
		break;
	   }
	   case 4:
	   {
		p.totalbill();
		break;
	   }
	   default :
	   {
		System.err.println("................Invalid option.......");
	   }
   
   }
	}
	void signup()
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the user-name");
	this.name=sc.next();
	System.out.println("Enter the email");
	this.email=sc.next();
	System.out.println("Enter the phone number");
    this.ph=sc.nextLong();
	System.out.println("Enter the password");
	this.pwd=sc.next();
	System.out.println("Hi "+name+" Thanks for joining us...... ");
	login();
	}
	void login()
	{
		Scanner k=new Scanner(System.in);
		System.out.println("........Please Login here.......");
   System.out.println("Enter the user-name");
   String name1=k.next();
   System.out.println("Enter the password");
   String pwd1=k.next();
   if (name1.equals(name)&&pwd1.equals(pwd))
   {
 System.out.println(".............Welcome "+name1+"................");
   }
   else
		{
			System.err.println("............Credentials are not matching........");
			System.out.println("......May be you need to sign-up...............");
		}
		menu();
	}
	void menu()
	{
	System.out.println("..............We are here you to serve you the authentic Indian cuisine..........");
	System.out.println(".....Please select your Menu.......");
	System.out.println(".........Veg. Dishes...........");
    System.out.println("1.Masala Dosa----------Rs.50");
	System.out.println("2.Idli vada------------Rs.25");
	System.out.println("3.Palav----------------Rs.30");
	System.out.println("-------********-------*********---------");
	System.out.println("..........Non-Veg Dishes.....");
	System.out.println("4.Chicken Biryani--------------Rs.250");
	System.out.println("5.Fish curry-------------------Rs.100");
	System.out.println("6.Egg fried rice---------------Rs.60");
	System.out.println("------********--------********------");
	totalbill();
	}
	void totalbill()
	{
		Scanner j=new Scanner(System.in);
		int masalaDosa=50;
		int idliVada=25;
		int palav=30;
		int chickenBiryani=250;
		int fishCurry=100;
		int eggFriedRice=60;
		int sum=0;
	System.out.println("Enter the dish number ");
	int dish=j.nextInt();
	System.out.println("Enter the quantity");
	int qty=j.nextInt();
	switch (dish)
	{
	case 1:
	{
	int bill1=masalaDosa*qty;
	sum=sum+bill1;
	break;
	}
	case 2:
	{
	int bill2=idliVada*qty;
	sum=sum+bill2;
	break;
	}
	case 3:
	{
	int bill3=palav*qty;
	sum=sum+bill3;
	break;
	}
	case 4:
	{
	int bill4=chickenBiryani*qty;
	sum=sum+bill4;
	break;
	}
	case 5:
	{
	int bill5=fishCurry*qty;
	sum=sum+bill5;
	break;
	}
	case 6:
	{
	int bill6=eggFriedRice*qty;
	sum=sum+bill6;
	break;
	}
	default :
	{
	System.out.println("......Invalid option......");
	}
		}
System.out.println("your total bill is "+sum);
	}
}
		