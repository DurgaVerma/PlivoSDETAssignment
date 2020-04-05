package plivo_SDET_Assignment_Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import clients.SlackApiClients;
import entites.archiveChannel.ArchiveChannelResponse;
import entites.createChannel.CreateChannelResponse;
import entites.joinChannel.JoinChannelResponse;
import entites.listChannel.ListChannelResponse;
import entites.renameChannel.RenameChannelResponse;
import utils.TestData;

public class SlackAPI_Test {
	public String channelId;
	public String channelName = TestData.generateRandomName();
	SlackApiClients slackApiClients = new SlackApiClients();
	String token = "xoxp-1038414164066-1038414164146-1047540060853-24c5ee27993ed89afcff34387978f893";
	
	
	@Test
	public void createChannelTest()
	{
		CreateChannelResponse createChannelResponse	= slackApiClients.createChannel(token, channelName);
		
		//Asserting Create Channel
		createChannelResponse.verifyStatusCode(200);
		Assert.assertEquals(createChannelResponse.getOk(),true);
	}
	
	@Test(dependsOnMethods= {"createChannelTest"})
	public void joinChannelTest()
	{
		JoinChannelResponse joinChannelResponse	= slackApiClients.joinChannel(token, channelName);
		//Asserting join Channel response
		joinChannelResponse.verifyStatusCode(200);
		Assert.assertEquals(joinChannelResponse.getOk(),true);
	}
	
	@Test(dependsOnMethods= {"createChannelTest"})
	public void listChannelTest()
	{
		ListChannelResponse listChannelResponse	= slackApiClients.listChannel(token);
		
		//Asserting List Channel Respone
		listChannelResponse.verifyStatusCode(200);
		Assert.assertEquals(listChannelResponse.getOk(),true);
		
		int size = listChannelResponse.getChannels().length; 
		
		//Getting channel id
		
		for(int i=0 ;i<size;i++)
		{
			if((listChannelResponse.getChannels()[i].getName()).equalsIgnoreCase(channelName))
			{
				channelId=listChannelResponse.getChannels()[i].getId();
				Reporter.log(String.format("channel Id for %s is  %s",channelName, channelId),true);
				
				break;
			}
		}
	}
	
	@Test(dependsOnMethods= {"listChannelTest"})
	public void renameChannelTest()
	{
		String renameChannelName = TestData.generateRandomName();
		RenameChannelResponse renameChannelResponse = slackApiClients.renameChannel(token,renameChannelName , channelId);
		
		//Asserting Rename Channel Response
		renameChannelResponse.verifyStatusCode(200);
		Assert.assertEquals(renameChannelResponse.getOk(),true);
		Assert.assertEquals(renameChannelResponse.getChannel().getName(), renameChannelName.toLowerCase());
	}
	

	@Test(dependsOnMethods= {"renameChannelTest"})
	public void archiveChannelTest()
	{
		ArchiveChannelResponse archiveChannelResponse = slackApiClients.archiveChannel(token, channelId);
		
		//Asserting archive Channel Response
		archiveChannelResponse.verifyStatusCode(200);
		Assert.assertEquals(archiveChannelResponse.getOk(),true);
		
	}
	
}
