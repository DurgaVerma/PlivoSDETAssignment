package plivo_SDET_Assignment;

import org.testng.annotations.Test;

import clients.SlackApiClients;

public class SlackAPITests {
	
	@Test
	public void createChannel()
	{
		SlackApiClients createChannel = new SlackApiClients();
		createChannel.createChannel("xoxp-1038414164066-1038414164146-1047379365862-83d0c498d6af85f0f4ea94adf301e86f", "Channel1");
	}

}
