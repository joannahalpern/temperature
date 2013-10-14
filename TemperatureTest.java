package temperature;

/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
 * @version 2013.10.06
 * Unit Testing Temperature class
 */

import org.junit.* ;
import static org.junit.Assert.* ;

public class TemperatureTest {

	/**
	 * Sample usage
	 * <pre><code>
	 *    Temperature averageHighInOctober = new Temperature (15, Temperature.CELSIUS);
	 *    Temperature converted = new Temperature(averageHighInOctober);
	 *    converted.changeUnits(Temperature.FAHRENHEIT);
	 *    System.out.println(
	 *          String.format(
	 *              "The average temperature of Montreal in October 2012 was %s (%s)",
	 *              averageHighInOctober.toString(),
	 *              converted.toString()));
	 */
	@Test
	public void test_returnCelsius(){
	System.out.println("Test if getUnits returns CELSIUS");
	Temperature boilingInCelsius = new Temperature(100, Temperature.Units.CELSIUS);
	Temperature.Units C = boilingInCelsius.getUnits();
	assertTrue(C == Temperature.Units.CELSIUS);
	}

//	@Test
//	public void test_unitsAfterConversion
//	Temperature boilingInCelsius = new Temperature (100, Temperature.CELSIUS);
	
  // Add multiple tests to check all functions of
  // {@Code Temperature} class.

  // @Test
  // public void .... (){
  //    ...
  // }

  // @Test
  // public void .... (){
  //    ...
  // }
}
