package com.ubs.opsit.interviews;

import org.apache.commons.lang.StringUtils;

import com.ubs.opsit.interviews.util.ClockUtil;
import com.ubs.opsit.interviews.util.ValidateUtil;

public class TimeConverterImpl implements TimeConverter {
	@Override
	public String convertTime(String aTime) {

		String time[] = aTime.split(":");

		if (ValidateUtil.getInstance().validateInputFormat(time)
				&& ValidateUtil.getInstance().validateInputValues(time)) {

			int hours = Integer.parseInt(time[0]);
			int minutes = Integer.parseInt(time[1]);
			int seconds = Integer.parseInt(time[2]);

			ClockUtil clockInstance = ClockUtil.getInstance();
			return clockInstance.getYelloWLampBlinkColor(seconds) + ClockUtil.LINE_SEPRATOR
					+ clockInstance.getFirstRowHoursColor(hours) + ClockUtil.LINE_SEPRATOR
					+ clockInstance.getSecondRowHoursColor(hours) + ClockUtil.LINE_SEPRATOR
					+ clockInstance.getThirdRowMinuteColor(minutes) + ClockUtil.LINE_SEPRATOR
					+ clockInstance.getFourthRowMinuteColor(minutes);
		}
		return StringUtils.EMPTY;
	}
}
