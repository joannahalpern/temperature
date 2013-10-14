package temperature;

/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
 * @version 2013.10.06
 * Unit Testing Temperature class
 */
// when I test data I will try to test situation which are most likely as well as the edge cases

import org.junit.* ;
import static org.junit.Assert.* ;

public class TemperatureTest {
	Temperature boilingInC = new Temperature(100, Temperature.Units.CELSIUS);
	Temperature boilingInF = new Temperature(212, Temperature.Units.FAHRENHEIT);
	Temperature boilingInK = new Temperature(373.15, Temperature.Units.KELVIN);
	
	Temperature absoluteZeroInC = new Temperature(-273.15, Temperature.Units.CELSIUS);
	Temperature absoluteZeroInF = new Temperature(-459.67, Temperature.Units.FAHRENHEIT);
	Temperature absoluteZeroInK = new Temperature(0, Temperature.Units.KELVIN);


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
	public void test_getUnits(){
//	System.out.println("Test if getUnits returns CELSIUS");
		Temperature.Units C = boilingInC.getUnits();
		assertTrue("getUnits doesn't return CELSIUS", C == Temperature.Units.CELSIUS);
	}
	
	@Test
	public void test_getValue(){
		double expectedValue = 100;
		double actualValue = boilingInC.getValue();
		assertEquals("get value doesn't return the expected value", expectedValue, actualValue, 0.000001);
	}

//	public void test_changeUnits(Temperature.Units unitsFrom, double valueFrom, Temperature.Units unitsTo, double valueTo){
//		Temperature boilingInC = new Temperature(100, Temperature.Units.CELSIUS);
//		Temperature boilingInF = new Temperature(212, Temperature.Units.FAHRENHEIT);
//		Temperature boilingInK = new Temperature(373.15, Temperature.Units.KELVIN);
//		
//		Temperature.Units expectedUnits = Temperature.Units.FAHRENHEIT;
//
//	}
	
	public void test_changeUnits(Temperature temperatureFrom, Temperature temperatureTo){ //meaning Temperature object from

		Temperature.Units expectedUnits = temperatureTo.getUnits();
		double expectedValue = temperatureTo.getValue();
		
		temperatureFrom.changeUnits(expectedUnits);
		Temperature.Units actualUnits = temperatureFrom.getUnits();
		double actualValue = temperatureFrom.getValue();
		
		assertTrue(expectedUnits == actualUnits);
		System.out.println("expectedUnits:" + expectedUnits);
		System.out.println("actualUnits:" + actualUnits);
		System.out.println("expectedValue:" + expectedValue);
		System.out.println("actualValue:" + actualValue);

		assertEquals(expectedValue, actualValue, 0.000001);
	}
	
	@Test
	public void test_changeUnits_CtoF(){
		test_changeUnits(boilingInC, boilingInF);
		test_changeUnits(absoluteZeroInC, absoluteZeroInF);
	}
	@Test
	public void test_changeUnits_CtoK(){
		test_changeUnits(boilingInC, boilingInK);
		test_changeUnits(absoluteZeroInC, absoluteZeroInK);
	}
	@Test
	public void test_changeUnits_FtoC(){
		test_changeUnits(boilingInF, boilingInC);
		test_changeUnits(absoluteZeroInF, absoluteZeroInC);
	}
	@Test
	public void test_changeUnits_FtoK(){
		test_changeUnits(boilingInF, boilingInK);
		test_changeUnits(absoluteZeroInF, absoluteZeroInK);
	}
	@Test
	public void test_changeUnits_KtoC(){
		test_changeUnits(boilingInK, boilingInC);
		test_changeUnits(absoluteZeroInK, absoluteZeroInC);
	}
	@Test
	public void test_changeUnits_KtoF(){
		test_changeUnits(boilingInK, boilingInF);
		test_changeUnits(absoluteZeroInK, absoluteZeroInF);
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
