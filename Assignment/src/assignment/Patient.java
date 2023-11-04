package assignment;

/*
This class is just a skeleton. Add your code where necessary. You might need to add additional methods as well.  
*/
import java.io.*;
import java.util.*;

public class Patient
{
	private String id;
	private String name;
	private Observation [] observations;	//size should be initialised to 50
	private int observationCount;  			//initialise to zero in constructor

	public Patient(String id, String name) //constructor
	{
		
	}
        
    public Patient(String id, String name, Observation[] observations, int observationCount) {
        this.id = id;
        this.name = name;
        this.observations = observations;
        this.observationCount = observationCount;
    }
        
        

	//method to add an observation (you can add to the method header if necessary)
    public void addObservation(Observation observation){
            for (int i = 0; i < observations.length; i++) {
            if (observations[i] == null) {
                observations[i] = observation;
                return; // Observation added, exit the loop
            }
        }
    }

    
    //getter and setter
    
    
    
    
	//other methods...

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getObservationCount() {
        return observationCount;
    }

    public void setObservationCount(int observationCount) {
        this.observationCount = observationCount;
    }

}