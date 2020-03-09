package com.rabo.javatest;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.HashSet;

public class DateProblem{
	/*This method expects 2 inputs, startTime and endTime in the format of HH:mm:ss. It calculates the difference between the those and counts all occurrences of time with only 2 unique digits in it.
	 * E.g. : if startTime=16:15:00 and endDate=17:00:00; then count is 2, i.e. : 16:16:11 and 16:16:16, with unique occurrences of of 1 and 6*/
	public int count (String startTime, String endTime)throws DateTimeParseException {

		int iCount = 0;
		// adding dummy dates to complete datetime format
		
			LocalTime startdateTime = LocalTime.parse(startTime);
			LocalTime enddateTime = LocalTime.parse(endTime);
		
			LocalTime intermediateTime = enddateTime;
			/* Using HashSet as it stores unique values */
			HashSet<Integer> hsUniqueSet;
			int h1;
			int h2;
			int m1;
			int m2;
			int s1;
			int s2 = 0;
			while (intermediateTime.isAfter(startdateTime) || intermediateTime.equals(startdateTime)) {

				hsUniqueSet = new HashSet<Integer>();
				/* Store all digits separately */
				h1 = intermediateTime.getHour() / 10;
				h2 = intermediateTime.getHour() % 10;
				m1 = intermediateTime.getMinute() / 10;
				m2 = intermediateTime.getMinute() % 10;
				s1 = intermediateTime.getSecond() / 10;
				s2 = intermediateTime.getSecond() % 10;

				hsUniqueSet.add(h1);
				hsUniqueSet.add(h2);
				hsUniqueSet.add(m1);
				hsUniqueSet.add(m2);
				hsUniqueSet.add(s1);
				hsUniqueSet.add(s2);
				// Find the exact scenario with 2 unique digits
				if (hsUniqueSet.size() == 2) {
					System.out.println(intermediateTime);
					iCount++;
				}
				intermediateTime = intermediateTime.minusSeconds(1);
			}

			return iCount;

		
	}
}