/**
 * SE320- Individual Assignment 5
 * 
 * Represents an Equilateral Triangle
 * and inherits from the Triangle class
 * @author Melissa LeBlanc
 */
public class EquilateralTriangle extends Triangle 
{
	/**
	 * {@inheritDoc}
	 * @param double length
	 * @throws exception
	 */
    EquilateralTriangle(double length)throws Exception 
    {
        super(length, length, length);
        if(!validateInput(length))
		{
    		throw new Exception("Invalid Inputs");
		}
    }
   
    /**
     * Changed the parameters which contained sideA, sideB, sideC 
     * to just sideA
     * @param sideA
     * @return boolean on whether sideA > 0
     */
    public boolean validateInput(double sideA) 
    {
        return sideA > 0;
    }
   
    /**
     * Changed the formula from (5)/4 to (3)/4
     * @return area of triangle
     */
    public double getArea() 
    {
        return (Math.sqrt(3)/4) * sideA * sideA;
    }
}
