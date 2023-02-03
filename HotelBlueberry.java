import java.util.Scanner;
class HotelBlueberry 
{
	String name;
	String pwd;
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Hotel Blueberry");
		HotelBlueberry b=new HotelBlueberry();
		b.disp();
	}
	void disp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Signup");
		System.out.println("2. Login");
		System.out.println("3. Menu");
		System.out.println("4. Exit");
		System.out.println("Enter your option");
		int option=sc.nextInt();
		switch (option)
		{
		case 1:
			{signup();
		break;}
		case 2:
			{login();
		break;}
		case 3:
			{menu();
		break;}
		case 4:
			{exit();
		break;}
		default :
			{System.out.println("Invaid option");
		break;}
		
		}
	}
	void signup()
	{
		Scanner b=new Scanner(System.in);
		System.out.println("Enter user name");
		String name=b.next();
		System.out.println("Enter Email ID");
		String email=b.next();
		System.out.println("Enter phone number");
		long ph=b.nextLong();
		System.out.println("Create your password");
	    String pwd=b.next();
		System.out.println("WELCOME "+name+" You have successfully created your account..........");
		this.name=name;
		this.pwd=pwd;
		login();
	}
	void login()
	{
	Scanner c=new Scanner(System.in);
	System.out.println("****Please Login****");
	System.out.println("Enter user name");
	String name1=c.next();
	System.out.println("Enter the password");
	String pwd1=c.next();
	if (name1.equals(name) && pwd1.equals(pwd))
	{
		System.out.println("***********You have been successfully logged in**********");
		order();
	}
	else
		{
		System.out.println("****************INVALID CREDENTIALS or NOT SIGNED UP*********************");
		System.out.println("Want to signup?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int choise=c.nextInt();
		if (choise==1)
		{
			signup();
		}
		else
			{
				exit();
			}
	}
    }
	void order()
	{
		double sum=0;
		int option3=1;
		Scanner d=new Scanner(System.in);
		System.out.println("***********Menu Card*******");
		System.out.println("1. Masala Dosa----------Rs.50");
		System.out.println("2. Pav Bhaji------------Rs.60");
		System.out.println("3. Idli wada------------Rs.35");
		System.out.println("4. Noodles--------------Rs.80");
		System.out.println("5. Fried Rice-----------Rs.60");
		System.out.println("6. Meals----------------Rs.65");
		while(option3!=2)
		{
		System.out.println("**********Enter the Menu Number*********");
		int option1=d.nextInt();
		System.out.println("Enter the Quantity");
		double option2=d.nextDouble();
		switch (option1)
		{
		case 1:
			{
				sum=sum+(50*option2);
				break;
			}
			case 2:
			{
				sum=sum+(60*option2);
				break;
			}
			case 3:
			{
				sum=sum+(35*option2);
				break;
			}
			case 4:
			{
				sum=sum+(80*option2);
				break;
			}
			case 5:
			{
				sum=sum+(60*option2);
				break;
			}
			case 6:
			{
				sum=sum+(65*option2);
				break;
			}
			default :
			{
				System.out.println("*****************Invalid Input******");
			}
		
		}
		System.out.println("Want to order more food?");
		System.out.println("1. Yes");
		System.out.println("2. No");
        option3=d.nextInt();
		}
		System.out.println("******ENJOY THE FOOD*******");
		System.out.println("Your Total Bill is "+sum);
		exit();
	}
	void menu()
	{
		Scanner f=new Scanner(System.in);
		System.out.println("***********Menu Card*******");
		System.out.println("1. Masala Dosa----------Rs.50");
		System.out.println("2. Pav Bhaji------------Rs.60");
		System.out.println("3. Idli wada------------Rs.35");
		System.out.println("4. Noodles--------------Rs.80");
		System.out.println("5. Fried Rice-----------Rs.60");
		System.out.println("6. Meals----------------Rs.65");
		System.out.println("Want to order some food");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int option4=f.nextInt();
		if (option4==1)
		{
			System.out.println("****Please Signup****");
			signup();
		}
		else
		{
			exit();
		}
	}
	void exit()
	{
		System.out.println("---------THANK YOU------VISIT AGAIN------");
	}
}
