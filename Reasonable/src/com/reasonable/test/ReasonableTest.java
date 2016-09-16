package com.reasonable.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.reasonable.core.IComparableAndReasonable;

public class ReasonableTest {

	IComparableAndReasonable<Integer, String> reasonable = new IComparableAndReasonable<Integer, String>() {

		@Override
		public int compareTo(Integer arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public String getReason() {
			return null;
		}
		
	};
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
