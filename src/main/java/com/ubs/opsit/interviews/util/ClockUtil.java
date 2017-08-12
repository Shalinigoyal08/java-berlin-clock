package com.ubs.opsit.interviews.util;

import org.apache.commons.lang.StringUtils;

public class ClockUtil {

	public static final String RED = "R";
	public static final String YELLOW = "Y";
	public static final String BLANK = "O";
	public static final String LINE_SEPRATOR = "\n";

	private volatile static ClockUtil instance;

	public static ClockUtil getInstance() {

		if (instance == null) {
			return new ClockUtil();
		}
		return instance;
	}

	/**
	 * calculate the yellow light blink at specific seconds.
	 * 
	 * @param seconds
	 * @return
	 */
	public String getYelloWLampBlinkColor(int seconds) {
		return seconds % 2 == 0 ? YELLOW : BLANK;
	}

	/**
	 * calculate first Hours row blink color
	 * 
	 * @param hours
	 * @return
	 */
	public String getFirstRowHoursColor(int hours) {
		return StringUtils.repeat(RED, hours / 5) + StringUtils.repeat(BLANK, 4 - (hours / 5));
	}

	/**
	 * calculate second Hours row blink color
	 * 
	 * @param i
	 * @return
	 */
	public String getSecondRowHoursColor(int hours) {
		return StringUtils.repeat(RED, hours % 5) + StringUtils.repeat(BLANK, 4 - (hours % 5));
	}

	/**
	 * calculate third minutes row blink color
	 * 
	 * @param i
	 * @return
	 */
	public String getThirdRowMinuteColor(int minutes) {
		String str = "";
		for (int j = 0; j < (minutes / 5); j++) {
			if (j == 2 || j == 5 || j == 8) {
				str = str + RED;
			} else {
				str = str + YELLOW;
			}
		}
		str = str + StringUtils.repeat(BLANK, 11 - (minutes / 5));
		return str;
	}

	/**
	 * calculate fourth minutes row blink color
	 * 
	 * @param minutes
	 * @return
	 */
	public String getFourthRowMinuteColor(int minutes) {
		return StringUtils.repeat(YELLOW, minutes % 5) + StringUtils.repeat(BLANK, 4 - (minutes % 5));
	}

}
