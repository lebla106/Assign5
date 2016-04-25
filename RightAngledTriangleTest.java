import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Melissa LeBlanc 
 *
 */
public class RightAngledTriangleTest 
{
	RightAngledTriangle myRightT;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception 
	{
		myRightT = new RightAngledTriangle(5, 12, 13);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link RightAngledTriangle#validateInput(double, double, double)}.
	 */
	@Test
	public void testValidateInput() 
	{
		assertTrue(myRightT.validateInput(5, 12, 13));
		assertFalse(myRightT.validateInput(5,11, 13));
	}
	
	/**
	 * Test method for {@link RightAngledTriangle#getPerimeter()}.
	 */
	@Test
	public void testGetPerimeter() 
	{
		assertEquals(30, myRightT.getPerimeter(), 0);
		
	}
	/**
	 * Test method for {@link RightAngledTriangle#getArea()}.
	 */
	@Test
	public void testGetArea() 
	{
		assertEquals(30, myRightT.getArea(), 0);
	}

	/**
	 * Test method for {@link RightAngledTriangle#RightAngledTriangle(double, double, double)}.
	 */
	@Test
	public void testRightAngledTriangle() 
	{
		assertEquals(5, myRightT.getSideA(),0);
		assertEquals(12, myRightT.getSideB(),0);
		assertEquals(13, myRightT.getSideC(),0);		
	}
}
