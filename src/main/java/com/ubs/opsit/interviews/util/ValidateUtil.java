package com.ubs.opsit.interviews.util;

public class ValidateUtil {

	public static final String PATTERN_FOR_TIME_FORMAT = "[0-9]{2}";

	private volatile static ValidateUtil instance;

	public static ValidateUtil getInstance() {

		if (instance == null) {
			return new ValidateUtil();
		}
		return instance;
	}

	/**
	 * check if input doesn't contain anything apart from number.
	 * 
	 * @param time
	 * @return
	 */
	public boolean validateInputFormat(String[] time) {
		return time[0].matches(PATTERN_FOR_TIME_FORMAT) && time[1].matches(PATTERN_FOR_TIME_FORMAT)
				&& time[2].matches(PATTERN_FOR_TIME_FORMAT);
	}

	/**
	 * check if hours , minutes , seconds value should not exceed from their
	 * range.
	 * 
	 * @param time
	 * @return
	 */
	public boolean validateInputValues(String[] time) {
		int hours = Integer.parseInt(time[0]);
		int min = Integer.parseInt(time[1]);
		int sec = Integer.parseInt(time[2]);
		if (hours >= 0 && hours <= 24 && min >= 0 && min <= 59 && sec >= 0 && sec <= 59) {
			return true;
		}
		return false;
	}

}
