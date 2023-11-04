package assignment;

/*
This class is just a skeleton. Add your code where necessary. You might need to add additional methods as well.  
*/
public class CategoryObservationType extends ObservationType
{
	private String [] categories;

        
        
	public CategoryObservationType(String code, String name, String [] categories)
	{
            super(code,name);
            this.categories=categories;
            
	}
        
        

	//override patent class abstract method here...

	//other methods...

    @Override
    public String getObservationTypeDetails() {
        return "null";
    }

    
}