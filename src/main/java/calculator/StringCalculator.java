package calculator;

class StringCalculator {

	/*public int calculator(String string) {	
		 return 0;
		 
		 //pass result
//		//Total tests run: 1, Passes: 1,  Failures: 0, Skips: 0
//		 
//		
//		//fail result
//		//return -1;
//		//Tests run: 1, Failures: 1, Skips: 0
//	
		 }*/
	
	/*public int calculator(String string) {	
		
	  if(string.isEmpty()) {
	      return 0;
	      }
		  return Integer.parseInt(string);
		
	}*/
   //Total tests run: 1, Passes: 1, Failures: 0, Skips: 0

	
	
	public int calculator(String input) {	
		
		String []numbers =input.split(",");
		
		  if(isEmpty(input)) {
	      return 0;
	      }
		  if(input.length()==1) {
			  return stringToInt(input);
		  }
		  else  {
			return Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);  
		  }
	}
	
	private boolean isEmpty(String input) {
	return input.isEmpty(); 
	}
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	} 
	//Total tests run: 3, Passes: 3, Failures: 0, Skips: 0

	
}	
