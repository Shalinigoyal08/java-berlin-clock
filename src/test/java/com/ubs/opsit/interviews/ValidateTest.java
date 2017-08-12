package com.ubs.opsit.interviews;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.interviews.util.ValidateUtil;

public class ValidateTest {

	@Test
	public void testValidateInput() {
		Assert.assertTrue(ValidateUtil.getInstance().validateInputFormat("12:12:11".split(":")));
		Assert.assertFalse("Seconds are in alphabet O",
				ValidateUtil.getInstance().validateInputFormat("12:12:OO".split(":")));
		Assert.assertFalse("Hours are in alphabet O",
				ValidateUtil.getInstance().validateInputFormat("OO:12:11".split(":")));
		Assert.assertFalse("Minutes are in alphabet O",
				ValidateUtil.getInstance().validateInputFormat("12:OO:11".split(":")));
	}

	@Test
	public void testValidateInputValues() {
		Assert.assertTrue(ValidateUtil.getInstance().validateInputValues("12:12:11".split(":")));
		Assert.assertFalse("Seconds are in alphabet O",
				ValidateUtil.getInstance().validateInputValues("25:12:00".split(":")));
		Assert.assertFalse("Hours are in alphabet O",
				ValidateUtil.getInstance().validateInputValues("11:67:11".split(":")));
		Assert.assertFalse("Minutes are in alphabet O",
				ValidateUtil.getInstance().validateInputValues("11:45:67".split(":")));
	}

}
