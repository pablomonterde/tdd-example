package agiletdd.oddeven;

public class OddEven {

	public String print(int number){
		if(number > 100)
			throw new RuntimeException(number + " is greater than 100");
		
		if (number == 2) return "PRIME";
		if (number % 2 == 0) return "EVEN";
		 
		for(int i=3 ;i*i <= number ;i += 2) {
			if(number % i==0)
				return "ODD";
		}
		 
		return "PRIME";
	}
	
}
