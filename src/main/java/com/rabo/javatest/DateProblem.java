package com.rabo.javatest;

import java.time.LocalDateTime;
import java.util.HashSet;

public class DateProblem {


	public int count(String startTime, String endTime) {

	 int iCount=0;
		LocalDateTime startdateTime = LocalDateTime.parse("2018-05-05T" + startTime);
		LocalDateTime enddateTime = LocalDateTime.parse("2018-05-05T" + endTime);
		LocalDateTime intermediateTime = enddateTime;
/* Using HashSet as it stores unique values*/
		HashSet<Integer> hsUniqueSet = null;
		int h1 = 0;
		int h2 = 0;
		int m1 = 0;
		int m2 = 0;
		int s1 = 0;
		int s2 = 0;
		while (intermediateTime.isAfter(startdateTime)||intermediateTime.equals(startdateTime) ) {

			hsUniqueSet = new HashSet<Integer>();
			/* Store all digits separately*/
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