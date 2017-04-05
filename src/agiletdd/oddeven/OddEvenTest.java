package agiletdd.oddeven;

import static org.junit.Assert.*;
import static java.util.Arrays.*;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class OddEvenTest {

	private OddEven oddEven;
	private List<Integer> primeNumbers;
	
	@Before
	public void setUp() throws Exception {
		
		primeNumbers = asList(1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
		oddEven = new OddEven();
		
	}

	@Test(expected = RuntimeException.class)
	public void throw_exception_when_try_to_print_a_number_greater_than_100() {
		 oddEven.print(101);
	}
	
	@Test
	public void should_return_prime_when_print_1() {
		assertEquals("PRIME", oddEven.print(1));
	}
	
	@Test
	@Ignore
	public void should_return_prime_when_print_2() {
		assertEquals("PRIME", oddEven.print(2));
	}
	
	@Test
	@Ignore
	public void should_return_prime_when_print_3() {
		assertEquals("PRIME", oddEven.print(3));
	}
	
	@Test
	@Ignore
	public void should_return_even_when_print_4() {
		assertEquals("EVEN", oddEven.print(4));
	}
	
	@Test
	@Ignore
	public void should_return_prime_when_print_5() {
		assertEquals("PRIME", oddEven.print(5));
	}
	
	@Test
	@Ignore
	public void should_return_even_when_print_6() {
		assertEquals("EVEN", oddEven.print(6));
	}
	
	@Test
	@Ignore
	public void should_return_prime_when_print_7() {
		assertEquals("PRIME", oddEven.print(7));
	}
	
	@Test
	@Ignore
	public void should_return_even_when_print_8() {
		assertEquals("EVEN", oddEven.print(8));
	}
	
	@Test
	@Ignore
	public void should_return_odd_when_print_9() {
		assertEquals("ODD", oddEven.print(9));
	}
	
	@Test
	@Ignore
	public void should_return_prime_when_print_11() {
		assertEquals("PRIME", oddEven.print(11));
	}
	
	@Test
	@Ignore
	public void should_return_even_when_print_an_even_number() {
		for(int number = 4; number <= 100 ; number += 2){
			assertEquals("EVEN", oddEven.print(number));
		}
	}
	
	@Test
	@Ignore
	public void should_return_odd_when_print_an_odd_number_and_is_not_prime() {
		for(int number = 1; number <= 100 ; number += 2){
			if(primeNumbers.contains(number)){
				continue;
			}
				System.out.println(number);
			assertEquals("ODD", oddEven.print(number));
		}
	}
	
	@Test
	@Ignore
	public void should_return_prime_when_print_a_prime_number() {
		for(int index = 0; index < primeNumbers.size() ; index++){
			assertEquals("PRIME", oddEven.print(primeNumbers.get(index)));
		}
	}
	
	

}
