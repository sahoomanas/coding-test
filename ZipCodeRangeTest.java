package java8;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;


import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author sahoo
 *
 */
class ZipCodeRangeTest {
	ZipCodeRange instance;
	List<Integer> list;
	/**
	 * instantiate the class to be tested 
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		instance=new ZipCodeRange();
	}
	/**
	 * method to initialize the zip code 
	 */
	private void initialize() {
	 this.list=Arrays.asList(94133,94133,94200,94299,94600,94699);
		
	}
	/**
	 * Test the minimum and maximum zip of expected value with actual value of zip codes
	 */
	@Test
	void testRange() {
		initialize();
		List<Integer> listexpected=Arrays.asList(94133,94699);
		assertTrue(listexpected.containsAll(instance.range(this.list)));
	}

}
