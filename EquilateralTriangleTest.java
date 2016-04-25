import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * @author Melissa LeBlanc
 *
 */
public class EquilateralTriangleTest {
	
	EquilateralTriangle myTriangle;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		myTriangle = new EquilateralTriangle(5);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link EquilateralTriangle#validateInput(double, double, double)}.
	 */
	@Test
	public void testValidateInput()
	{
		assertTrue(myTriangle.validateInput(5));
		assertFalse(myTriangle.validateInput(-1));
		
	}
	
	/**
	 * Test method for {@link EquilateralTriangle#getPerimeter()}.
	 */
	@Test
	public void testGetPerimeter() 
	{
		assertEquals(15, myTriangle.getPerimeter(), 0);
		
	}

	/**
	 * Test method for {@link EquilateralTriangle#getArea()}.
	 */
	@Test
	public void testGetArea() 
	{
		assertEquals(10.82531754, myTriangle.getArea(), 0.5);		
	}

	/**
	 * Test method for {@link EquilateralTriangle#EquilateralTriangle(double)}.
	 */
	@Test
	public void testEquilateralTriangle() 
	{
		assertEquals(5, myTriangle.getSideA(), 0);		
	}
	
}
