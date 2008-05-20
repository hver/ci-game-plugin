package hudson.plugins.cigame.rules.unittesting;

import hudson.model.Result;
import hudson.plugins.cigame.rules.unittesting.IncreasingPassedTestsRule;

import org.junit.Assert;
import org.junit.Test;

public class IncreasingPassedTestsRuleTest {
    @Test
    public void test() {
        Assert.assertEquals("2 = two", String.format("%d = two", 2));
        Assert.assertEquals("2 = two", String.format("%.0f = two", (double)2));
    }
/*
	@Test
	public void testNoTests() throws Exception {
		IncreasingPassedTestsRule rule = new IncreasingPassedTestsRule(10);
		double points = rule.evaluate(Result.SUCCESS, Result.SUCCESS, 0, 0);
		Assert.assertEquals("No new test should give 0 points", 0, points);
	}
	
	@Test
	public void testMorePassingTests() throws Exception {
		IncreasingPassedTestsRule rule = new IncreasingPassedTestsRule(10);
		double points = rule.evaluate(Result.UNSTABLE, Result.UNSTABLE, 2, 0);
		Assert.assertEquals("2 new test should give 20 points", 20, points);
	}
	
	@Test
	public void testLessPassingTests() throws Exception {
		IncreasingPassedTestsRule rule = new IncreasingPassedTestsRule(10);
		double points = rule.evaluate(Result.UNSTABLE, Result.UNSTABLE, 2, 4);
		Assert.assertEquals("2 lost tests should give 0 points", 0, points);
	}
	
	@Test
	public void testPreviousBuildFailed() throws Exception {
		IncreasingPassedTestsRule rule = new IncreasingPassedTestsRule(10);
		double points = rule.evaluate(Result.UNSTABLE, Result.FAILURE, 1, 0);
		Assert.assertEquals("Previous failed build should give 0 points", 0, points);
	}
	
	@Test
	public void testCurrentBuildFailed() throws Exception {
		IncreasingPassedTestsRule rule = new IncreasingPassedTestsRule(10);
		double points = rule.evaluate(Result.FAILURE, Result.UNSTABLE, 1, 0);
		Assert.assertEquals("Current build failed should give 0 points", 0, points);
	}
	*/
}
