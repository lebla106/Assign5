
/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Triangle and has the two basic functions of 
 * calculating the perimeter as well as the area.
 * 
 * @author Melissa LeBlanc
 */
public class Triangle 
{ 
    protected double sideA;
    protected double sideB;
    protected double sideC;
    
    /**
     * @param sideA
     * @param sideB
     * @param sideC
     * @throws Exception
     */
    Triangle(double sideA, double sideB, double sideC) throws Exception 
    {
        if (!validateInput(sideA, sideB, sideC)) 
        {
            throw new Exception("Invalid Inputs");
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
   /**
    * @param sideA
    * @param sideB
    * @param sideC
    * @return boolean whether all sides are > 0
    */
    public boolean validateInput(double sideA, double sideB, double sideC) 
    {
       if( sideA > 0 && sideB > 0 && sideC > 0)
    	   return true;
       else
    	   return false;
    }
   
    /**
     * @return double sideA
     */
    public double getSideA() 
    {
        return this.sideA;
    }
    
    /**
     * @return double sideB
     */
    public double getSideB() 
    {
        return this.sideB;
    }
    
    /**
     * @return double sideC
     */
    public double getSideC() 
    {
        return this.sideC;
    }
    
    /**
     * @return double perimeter
     */
    public double getPerimeter() 
    {
        return sideA + sideB + sideC;
    }
    
    /**
     * Uses Heron's Formula to get the area of triangle.
     * @return area of triangle
     */
    public double getArea() 
    {
        double p = getPerimeter()/2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

}
