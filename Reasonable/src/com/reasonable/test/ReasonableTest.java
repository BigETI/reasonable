package com.reasonable.test;

import org.junit.Before;
import org.junit.Test;

/**
 * Reasonable test class
 * 
 * @author Ethem Kurt
 * 
 * @version 1.0.0
 * 
 * @since 1.0.0
 *
 */
public class ReasonableTest {

	/**
	 * Reasonable string comparator
	 */
	private ReasonableStringComparator reasonable;

	/**
	 * Set up
	 * 
	 * @throws Exception
	 *             Exception
	 */
	@Before
	public void setUp() throws Exception {
		reasonable = new ReasonableStringComparator("This");
	}

	/**
	 * Test
	 */
	@Test
	public void test() {
		if (reasonable.compareTo("That") != 0)
			System.out.println(reasonable);
	}
}
