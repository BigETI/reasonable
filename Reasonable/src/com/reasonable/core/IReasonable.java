package com.reasonable.core;

/**
 * Reasonable interface
 * 
 * This interface allows programmers use a design specified for reasoning
 * decisions in runtime.
 * 
 * @author Ethem Kurt
 * 
 * @version 1.0.0
 * 
 * @since 1.0.0
 *
 * @param <TA>
 *            Comparable type
 * @param <TB>
 *            Reason type
 */
public interface IReasonable<TA, TB> extends Comparable<TA> {

	/**
	 * Get specified reason
	 * 
	 * @return Specified reason
	 */
	public TB getReason();
}
