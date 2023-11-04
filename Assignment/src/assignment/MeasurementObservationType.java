package assignment;

/*
This class is just a skeleton. Add your code where necessary. You might need to add additional methods as well.  
*/

public class MeasurementObservationType extends ObservationType
{
	private String unit;

	public MeasurementObservationType(String code, String name, String unit)
	{
            super(code,name);
            this.unit = unit;
	}

	//override patent class abstract method here...

	//other methods...

    @Override
    public String getObservationTypeDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}