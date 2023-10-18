package lab4_ex1;
public class Dog
{
	private String name;
	private char size;	// 'B', 'M' or 'S'
								// for big, medium and small

        public char getSize() {
            return size;
        }

	public Dog(String name, char size)
	{
		this.name = name ;
		this.size = size;
	}

	public String getDetails()
	{
		return "name: " + name + ", size: " + size;
	}

	public String toString()
	{
		return getClass().getName() + getDetails();
	}
}