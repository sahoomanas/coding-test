package java8;


import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/*
 * Test  class to test RangeTest class
 */
class RangeUnitTest {
	RangeTest rangeTest;
	Map<String,List> map=new HashMap<String,List>();
	@BeforeEach
	void setUp() throws Exception {
		rangeTest=new RangeTest();
	}
	/*
	 * used to initialize the Range of zip codes
	 * rangeList : 
	 */
   private void initialize() {
	  List<Range> rangeList=new ArrayList<Range>();
		rangeList.add(new Range(94133,94133));
		rangeList.add(new Range(94200,94299));
		rangeList.add(new Range(94600,94699));
		
		List<Integer> input=Arrays.asList(94199, 94300, 65532,94133, 94650, 94230, 94600, 94299);
		 this.map=rangeTest.testZipShipping(rangeList, input);
  }
	/**
	 * test the shipped expected zip code with actual zip code
	 */
	@Test
	void testShipped() {
		initialize();
		List<Integer> expectedshipped=Arrays.asList(94230,94650);
		assertTrue("Shipped zip code are equals ...",expectedshipped.containsAll(map.get("shipped")));
	}
	/**
	 * test the not shipped expected zip code with actual
	 */
	@Test
	void testNotShipped() {
		initialize();
		List<Integer> expectednotshipped=Arrays.asList(94600,94299,94199,94300,65532,94133);
	    assertTrue("Shipped zip code are equals ...",expectednotshipped.containsAll(map.get("notshipped")));
	}

}
