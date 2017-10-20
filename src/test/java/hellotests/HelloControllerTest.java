package hellotests;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.CalculationService;

public class HelloControllerTest {

	CalculationService calcService = new CalculationService();
	
	@Test
	public void test() {
		assertEquals(10,calcService.calculation(5, 5));
	}
	
//	@Test
//	public void testFail() {
//		fail("Test is intentionally failing");
//	}

}
