package assignment;

/*
This class is just a skeleton. Add your code where necessary. You might need to add additional methods as well.  
*/
public class CategoryObservation extends Observation
{
	private String value;

	public CategoryObservation(CategoryObservationType observationType, String value) //you may add to this method header
	{
            super(observationType);
            this.value = value;
	}

   
        
        
        
	//override patent class abstract method here...

	//other methods...

    @Override
    public String getObservationDetails() {
        return " ";
    }
}
