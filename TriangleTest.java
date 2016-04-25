import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Melissa LeBlanc
 *
 */
public class TriangleTest {
	Triangle myT;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception 
	{
		myT = new Triangle(2, 14, 15);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {}

	/**
	 * Test method for {@link Triangle#Triangle(double, double, double)}.
	 */
	@Test
	public void testTriangle() 
	{
		
		assertEquals(2, myT.getSideA(),0);
		assertEquals(14, myT.getSideB(),0);
		assertEquals(15, myT.getSideC(),0);
	}

	/**
	 * Test method for {@link Triangle#validateInput(double, double, double)}.
	 */
	@Test
	public void testValidateInput() 
	{
		assertTrue(myT.validateInput(2, 14, 15));
		assertFalse(myT.validateInput(-5,-7,-10));
		assertFalse(myT.validateInput(-6, 8, 9));
	}

	/**
	 * Test method for {@link Triangle#getSideA()}.
	 */
	@Test
	public void testGetSideA() 
	{
		assertEquals(2, myT.getSideA(), 0);
	}

	/**
	 * Test method for {@link Triangle#getSideB()}.
	 */
	@Test
	public void testGetSideB() 
	{
		assertEquals(14, myT.getSideB(), 0);
	}

	/**
	 * Test method for {@link Triangle#getSideC()}.
	 */
	@Test
	public void testGetSideC() 
	{
		assertEquals(15, myT.getSideC(), 0);
	}

	/**
	 * Test method for {@link Triangle#getPerimeter()}.
	 */
	@Test
	public void testGetPerimeter() 
	{
		assertEquals(31, myT.getPerimeter(), 0);
	}

	/**
	 * Test method for {@link Triangle#getArea()}.
	 */
	@Test
	public void testGetArea() 
	{
		assertEquals(12.5274, myT.getArea(), 0.5);
	}

}
