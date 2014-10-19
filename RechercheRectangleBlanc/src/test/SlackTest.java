package test;
import static org.junit.Assert.*;

import org.junit.Test;

import slack.Slack;

public class SlackTest {

	@Test
	public void whenSlackCreatedThenEmptySlack() {
		Slack slack = new Slack();
		
		assertTrue(slack.isEmpty());
	}
	
	@Test(expected=RuntimeException.class)
	public void givenEmptySlackWhenPoppingThenExceptionExpected() {
		Slack slack = new Slack();
		
		slack.pop();
	}
	
	@Test
	public void givenANotEmptySlackWhenPoppingThenLastValuePopped() {
		Slack slack = new Slack();
		
		slack.push(1);
		slack.push(2);
		slack.push(3);

		assertEquals(slack.pop(), 3);
		assertEquals(slack.pop(), 2);
		assertEquals(slack.pop(), 1);

	}
}