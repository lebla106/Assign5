/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Right Angled Triangle
 * @author Melissa LeBlanc
 */
public class RightAngledTriangle extends Triangle 
{
    /**
     * @param width
     * @param height
     * @param hypotenuse
     * @throws Exception
     */
    RightAngledTriangle(double width, double height, double hypotenuse)
            throws Exception 
    {
    	super(width, height, hypotenuse);
    	if(!validateInput(width, height, hypotenuse))
		{
    		throw new Exception("Invalid Inputs");
		}
    }
    
    /**
     * @param double sideA
     * @param double sideB
     * @param double sideC
     * @return boolean if validated input
     *     
     */
    public boolean validateInput(double sideA, double sideB, double sideC)     
    {
       if((sideC * sideC) == ((sideA * sideA) + (sideB * sideB)))
    	   return true;
       else
    	   return false;
    }

    /**
     * @return double area of triangle
     */
    public double getArea() 
    {
        return ((sideA * sideB) / 2);
    }

}
