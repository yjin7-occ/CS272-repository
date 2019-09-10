/**
 * CS 272 - Fall 2019
 * H01-RoachPopulation.java
 */
package occ.cs272.h01;

/**
 * @author <yjin7>
 * @version <09/09/2019>
 *
 */
public class RoachPopulation
{	
	// TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "yjin7";
    public static final String ASSIGNMENT = "H01-A";

    // TODO: Complete the RoachPopulation class
    private int population;
    public RoachPopulation(int initialPopulation) {
    	population = initialPopulation;
    }
    public void breed() {
    	population *=2;   
    }
    public void spray() {
    	population = population - (int) (population*0.1);
    }
    public int getRoaches() {
    	return population;
    }
    
}
