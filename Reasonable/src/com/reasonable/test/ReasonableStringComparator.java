package com.reasonable.test;

import com.reasonable.core.IReasonable;

/**
 * Reasonable string comparator class
 * 
 * @author Ethem Kurt
 * 
 * @version 1.0.0
 * 
 * @since 1.0.0
 *
 */
public class ReasonableStringComparator implements IReasonable<String, String> {

	/**
	 * String to compare with
	 */
	private String str;

	/**
	 * Specified reason
	 */
	private String reason = "No reason";

	/**
	 * Constructor
	 * 
	 * @param str
	 *            String to compare
	 */
	public ReasonableStringComparator(String str) {
		this.str = str;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(String arg0) {
		int ret = str.compareTo(arg0);
		if (ret > 0)
			reason = "\"" + str + "\" is way better than \"" + arg0 + "\".";
		else if (ret > 0)
			reason = "\"" + str + "\" is less better than \"" + arg0 + "\".";
		else
			reason = "\"" + str + "\" is like \"" + arg0 + "\" are the same.";
		return ret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.reasonable.core.IReasonable#getReason()
	 */
	@Override
	public String getReason() {
		return reason;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return reason;
	}

}
