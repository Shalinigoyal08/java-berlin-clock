package com.ubs.opsit.interviews;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.interviews.util.ClockUtil;

public class ClockUtilTest {

	@Test
	public void testYellowLampOnTop() {
		ClockUtil clockInstance = ClockUtil.getInstance();
		Assert.assertEquals("O", clockInstance.getYelloWLampBlinkColor(59));
		Assert.assertEquals("Y", clockInstance.getYelloWLampBlinkColor(00));
		Assert.assertEquals("Y", clockInstance.getYelloWLampBlinkColor(12));
		Assert.assertEquals("O", clockInstance.getYelloWLampBlinkColor(01));
	}

	@Test
	public void testFirstRowHoursLights() {
		ClockUtil clockInstance = ClockUtil.getInstance();
		Assert.assertEquals("OOOO", clockInstance.getFirstRowHoursColor(00));
		Assert.assertEquals("RROO", clockInstance.getFirstRowHoursColor(13));
		Assert.assertEquals("RRRR", clockInstance.getFirstRowHoursColor(23));
	}

	@Test
	public void testSecondRowHoursLights() {
		ClockUtil clockInstance = ClockUtil.getInstance();
		Assert.assertEquals("OOOO", clockInstance.getSecondRowHoursColor(00));
		Assert.assertEquals("RRRO", clockInstance.getSecondRowHoursColor(13));
		Assert.assertEquals("RRRO", clockInstance.getSecondRowHoursColor(23));
		Assert.assertEquals("RRRR", clockInstance.getSecondRowHoursColor(24));
	}

	@Test
	public void testThirdRowHoursLights() {
		ClockUtil clockInstance = ClockUtil.getInstance();
		Assert.assertEquals("OOOOOOOOOOO", clockInstance.getThirdRowMinuteColor(00));
		Assert.assertEquals("YYOOOOOOOOO", clockInstance.getThirdRowMinuteColor(13));
		Assert.assertEquals("YYRYYOOOOOO", clockInstance.getThirdRowMinuteColor(27));
		Assert.assertEquals("YYROOOOOOOO", clockInstance.getThirdRowMinuteColor(17));
		Assert.assertEquals("YYRYYRYYRYY", clockInstance.getThirdRowMinuteColor(59));
	}

	@Test
	public void testFourthRowHoursLights() {
		ClockUtil clockInstance = ClockUtil.getInstance();
		Assert.assertEquals("OOOO", clockInstance.getFourthRowMinuteColor(00));
		Assert.assertEquals("YYYO", clockInstance.getFourthRowMinuteColor(13));
		Assert.assertEquals("YYOO", clockInstance.getFourthRowMinuteColor(27));
		Assert.assertEquals("YYYY", clockInstance.getFourthRowMinuteColor(59));
	}

}
