/**
 * CS 272 - Fall 2019
 * H01-Sequence.java
 */
package occ.cs272.h01;

/**
 * @author <yjin7>
 * @version <09/09/2019>
 *
 */
public class Sequence
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "yjin7";
    public static final String ASSIGNMENT = "H01-D";
    
    private int[] array;
    
    /**
     * Constructs a sequence of integers.
     * @param array the array to initialize the sequence.
     */
    public Sequence(int[] array)
    {
        this.array = array.clone();
    }
    
    // TODO: Write the three versions of slice() here
    
    public Sequence slice(int start) {
    	int originalLength = this.array.length;
    	int resultLength;
    	if(start>=0) {
    		resultLength = originalLength - start;
    	}
    	else {
    		resultLength = 0 - start;
    	}
    	int[] a = new int[resultLength];
    	int j;
    	if(start>=0) {
    		j = start;
    	}
    	else {
    		j = (originalLength -((-start)% originalLength))% originalLength;
    	}
    		
    	for(int i=0; i<resultLength; i++) {
    		a[i] = array[j];
    		j++;
    	}
    	return new Sequence(a);
    }
    
    public Sequence slice(int start, int end) {
    	int originalLength = this.array.length;
    	int resultLength=0;
    	if(end!=start) {
    		resultLength = end - start;
    	}
    	
    		
    	int[] a = new int[resultLength];
    	int j = start;
    	for(int i=0; i<resultLength; i++) {
    		a[i] = array[j];
    		j++;
    	}
    	return new Sequence(a);
    }
    
    public Sequence slice(int start, int end, int step) {
    	int originalLength = this.array.length;
    	int resultLength;
    	if((end - start)%step==0) {
    		resultLength = (end - start)/step;
    	}
    	else {
    		resultLength = (end - start)/step+1;
    	}
    	int[] a = new int[resultLength];
    	int j;
    	if(start>0) {
    		j = start;
    	}
    	else {
    		j = j = (originalLength -((-start)% originalLength))% originalLength;
    	}
    	for(int i=0; i<resultLength; i++) {
    		a[i] = array[j];
    		j+=step;
    	}
    	return new Sequence(a);
    }
    
    
    
    @Override
    public String toString()
    {
        String result = "{";
        if (array.length > 0)
        {
            result += array[0];
            for (int i = 1; i < array.length; i++)
            {
                result += ", " + array[i];
            }
        }
        return result + "}";
    }
    
    public static void main(String[] args)
    {
        Sequence a = new Sequence(new int[]{1, 2, 3, 4, 5});
        // some informal testing
//        System.out.println("a.slice(0)->" + a.slice(0));
//        System.out.println("a.slice(1)->" + a.slice(1));
//        System.out.println("a.slice(-1)->" + a.slice(-1));
//        System.out.println("a.slice(-2)->" + a.slice(-2));
//        System.out.println("a.slice(5)->" + a.slice(5));
//        System.out.println("a.slice(-5)->" + a.slice(-5));
//        System.out.println("a.slice(0, 5, 2)->" + a.slice(0, 5, 2));
//        System.out.println("a.slice(1, 5, 2)->" + a.slice(1, 5, 2));
//        System.out.println("a.slice(1, 5, 3)->" + a.slice(1, 5, 3));
//        System.out.println("a.slice(2, 5, 3)->" + a.slice(2, 5, 3));
//        System.out.println("a.slice(-1, -6, -1)->" + a.slice(-1, -6, -1));
    }
}
