package assignment;

/*
This class is just a skeleton. Add your code where necessary. You might need to add additional methods as well.  
*/
public class MeasurementObservation extends Observation
{
	private double value;

    public MeasurementObservation(double value, ObservationType observationType) {
        super(observationType);
        this.value = value;
    }

	

	//override patent class abstract method here...
	
	//other methods...

    @Override
    public String getObservationDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}