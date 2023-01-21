package com.Qsoiders.Atlasian.genericUtility;

import java.time.LocalDateTime;
/**
 * These are the Java Library given facilities
 * @author SAMPATH P
 *
 */
public class JavaUtility {
/**
 * 
 * It will give the Date and time of the current machine
 * @return
 */
	public String timeStamp() {
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		return timeStamp;
	}
}
