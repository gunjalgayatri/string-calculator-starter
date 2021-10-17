package calculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

class StringCalculatorShould {

	//make calculator as field to avoid repeation of code
	private StringCalculator calculator;
	
	
	//Calculator initiled Here
	@BeforeTest
	public void init() {
		calculator=new StringCalculator();
	}
	
	
	//1.Empty String Retunn Zero
	//Result
	//passed nothing --->return 0
	@Test
	public void emptyStringReturnzero() throws Exception {
	
		assertEquals(calculator.calculator(""),0);
	}

	//2.A single number value return  
		//Result
		//passed 1 --> return 1
	    @Test
		public void singleValueIsReplied() throws Exception {
			assertEquals(calculator.calculator("1"),1) ;	
		}

	    
	  //3.Two numbers comma delimited return sum
		//Result
		//Output must 1+2 ---> 3
	    @Test
		public void twoNumbersCommaDelimited() throws Exception {
			assertEquals(calculator.calculator("1,2"),3) ;
		}
		
	  //4.Two numbers ,newline dilimited return the sum.
		//Result
		//output 1 new line 2 ---> 3
	    @Test
		public void twoNumberNewLineDilimter() throws Exception {
			assertEquals(calculator.calculator("1\n2"),3) ;
		 }
		
	
}
