package lab4_ex1;

public class Computer
{
	private String brand;	//  e.g. HP
	char kind;		// 'D' or 'L'
									// for desktop and labtop

	public Computer(String brand, char kind)
	{
		this.brand = brand;
		this.kind = kind;
	}

	public String getDetails()
	{
		return "brand: " + brand
			+ ", kind: " + (kind == 'D'? "desktop": "labtop");
	}

	public String toString()
	{
		return getClass().getName() + getDetails();
	}
}