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

	
	
	/*public int calculator(String input) {	
		
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
	}*/ 
	//Total tests run: 3, Passes: 3, Failures: 0, Skips: 0

	
	/*public int calculator(String input) {	
		
		String []numbers =input.split(",|\n");
		
		  if(isEmpty(input)) {
	      return 0;
	      }
		  if(input.length()==1) {
			  return stringToInt(input);
		  }
		  else  {
			return getSum(numbers[0], numbers[1]) ;
		  }
	}

	//Refactor
	private int getSum(String numA, String numB) {
		return Integer.parseInt(numA)+Integer.parseInt(numB);
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}*/
	//Total tests run: 4, Passes: 4, Failures: 0, Skips: 0
	
	
	/*public int calculator(String input) {	
    	
    	//refactor
    	final String delimiter= ",|\n";
    	String []numbers =input.split(delimiter );
    	
	  if(isEmpty(input)) {
        return 0;
    }
    	  if(input.length()==1) {
    		  return stringToInt(input);
    	  }
    	  else  {
    	return getSum(numbers) ;
    	  }
    }

    //Refactor
    private int getSum(String [] numbers) {
	int sum=0;
    	for (int current = 0; current < numbers.length; current++) {
    		sum+= Integer.parseInt(numbers[current]);
    	}
    	return sum;
    }
    
    private boolean isEmpty(String input) {
    	return input.isEmpty();
    }
    
    private int stringToInt(String input) {
    	return Integer.parseInt(input);
    }*/
    //Total tests run: 5, Passes: 5, Failures: 0, Skips: 0
 

    
    
  public int calculator(String input) throws Exception {	
	
	//refactor
	final String delimiter= ",|\n";
	String []numbers =input.split(delimiter );

	  if(isEmpty(input)) {
  return 0;
 }
	  if(input.length()==1) {
		  return stringToInt(input);
	  }
	  else  {
		return getSum(numbers) ;
	  }
}

//Refactor
private int getSum(String [] numbers) throws Exception {
	
	for(String current :numbers) {
		if(stringToInt(current )<0) {
			throw new Exception("Negative Input ");
		}
	}
	
	
	int sum=0;
	//refactor
	for (String current:numbers) {
		sum+= Integer.parseInt(current);
	}
	return sum;
}

private boolean isEmpty(String input) {
	return input.isEmpty();
}

private int stringToInt(String input) {
	return Integer.parseInt(input);
}

//Total tests run: 6, Passes: 6, Failures: 0, Skips: 0
}

   

	
	
	
	
	
