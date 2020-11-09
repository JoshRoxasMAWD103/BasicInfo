import java.util.Scanner;
public class BasicInfo
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//Last Name
		System.out.println("Enter Last Name:");
		String lastName = input.nextLine();
		//First Name
		System.out.println("Enter First Name:");
		String firstName = input.nextLine();
		//Middle Name
		System.out.println("Enter Middle Name:");
		String middleName = input.nextLine();
		//Street
		System.out.println("Street Address:");
		String street = input.nextLine();
		//City
		System.out.println("City/Municipality:");
		String city = input.nextLine();
		//Province
		System.out.println("Province:");
		String province = input.nextLine();
		//Zip Code
		System.out.println("Zip Code:");
		String zipCode = input.nextLine();
		//Phone Number
		System.out.println("Phone Number:");
		String phoneNum = input.nextLine();
		
		//Outputs
		System.out.println("Your full name is:"+ " " + firstName +" " + middleName + " " + lastName);
		System.out.println("Your Complete Address is:" + " " + street + "," + " " + city + "," + " " + province + " " + zipCode);
		System.out.println("Your Contact Information is:" + " " + phoneNum);

	}

}
