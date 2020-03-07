package com.rabo.javatest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDateProblem {
	DateProblem dp = new DateProblem();
@Test
	public void testSampleProblem() {
		int iCount =dp.count("16:15:00", "17:00:00");
		assertEquals(2, iCount);
		
		//fail("Not yet implemented");
	}
	@Test
	public void testBoundaryCase() {
		int iCount =dp.count("16:15:00", "17:17:17");
		assertEquals(6, iCount);
		
		//fail("Not yet implemented");
	}
	@Test
	public void testBothBoundariesCase() {
		int iCount =dp.count("16:16:11", "17:17:17");
		assertEquals(6, iCount);
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testComplexCase() {
		int iCount =dp.count("22:00:00", "23:00:00");
		assertEquals(87, iCount);
		
		//fail("Not yet implemented");
	}
	@Test
	public void testEndDateLessThanStartDateCase() {
		int iCount =dp.count("23:00:00", "01:00:00");
		assertEquals(104, iCount);
		
		//fail("Not yet implemented");
	}
	@Test
	public void testEndDateEqStartDateCase() {
		int iCount =dp.count("17:17:17", "17:17:17");
		assertEquals(1, iCount);
		
		//fail("Not yet implemented");
	}
	@Test
	public void testInvalidDateFormatCase() {
		int iCount =dp.count("231:00:00", "01:00:00");
		assertEquals(-1, iCount);
		
		//fail("Not yet implemented");
	}
}