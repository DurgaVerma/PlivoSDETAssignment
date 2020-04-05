package clients;

import static io.restassured.RestAssured.given;

import org.testng.Reporter;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

import entites.archiveChannel.ArchiveChannelResponse;
import entites.createChannel.CreateChannelResponse;
import entites.joinChannel.JoinChannelResponse;
import entites.listChannel.ListChannelResponse;
import entites.renameChannel.RenameChannelResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import properties.SlackAPIs;

public class SlackApiClients {
	public  CreateChannelResponse createChannel(String token,String name)
	{
		Reporter.log(String.format("\n createChannel URL --- POST %s", SlackAPIs.createChannelURL),true);
		Response response = given()
				.queryParam("token",token)
				.queryParam("name", name)
                .contentType(ContentType.JSON)
                .post(SlackAPIs.createChannelURL);
		       
		Reporter.log(String.format("\n CreateChannel Response status code --- %s", response.getStatusCode()),true);
		Reporter.log(String.format("\n CreateChannel Response --- %s", response.asString()),true);
		
        CreateChannelResponse createChannelResponse = response.as(CreateChannelResponse.class);
        createChannelResponse.setHttpStatusCode(response.getStatusCode());
        return createChannelResponse;
	}
	
	public  JoinChannelResponse joinChannel(String token,String name)
	{
		Reporter.log(String.format("\n joinChannel URL --- POST %s", SlackAPIs.joinChannelURL),true);
		Response response = given()
				.queryParam("token",token)
				.queryParam("name", name)
                .contentType(ContentType.JSON)
                .post(SlackAPIs.joinChannelURL);
		       
		Reporter.log(String.format("\n joinChannel Response status code --- %s", response.getStatusCode()),true);
		Reporter.log(String.format("\n joinChannel Response --- %s", response.asString()),true);
		
        JoinChannelResponse joinChannelResponse = response.as(JoinChannelResponse.class);
        joinChannelResponse.setHttpStatusCode(response.getStatusCode());
        return joinChannelResponse;
	}
	
	public  ListChannelResponse listChannel(String token)
	{
		Reporter.log(String.format("\n listChannel URL --- Get %s", SlackAPIs.listChannelURL),true);
		Response response = given()
				.queryParam("token",token)
				.contentType(ContentType.JSON)
                .get(SlackAPIs.listChannelURL);
		       
		Reporter.log(String.format("\n listChannel Response status code --- %s", response.getStatusCode()),true);
		Reporter.log(String.format("\n listChannel Response --- %s", response.asString()),true);
		
        ListChannelResponse listChannelResponse = response.as(ListChannelResponse.class);
        listChannelResponse.setHttpStatusCode(response.getStatusCode());
        return listChannelResponse;
	}
	
	public  RenameChannelResponse renameChannel(String token,String channelName,String channelId)
	{
		Reporter.log(String.format("\n renameChannel URL --- Get %s", SlackAPIs.renameChannelURL),true);
		Response response = given()
				.queryParam("token",token)
				.queryParam("channel", channelId)
				.queryParam("name", channelName)
				.contentType(ContentType.JSON)
                .post(SlackAPIs.renameChannelURL);
		       
		Reporter.log(String.format("\n renameChannel Response status code --- %s", response.getStatusCode()),true);
		Reporter.log(String.format("\n renameChannel Response --- %s", response.asString()),true);
		
        RenameChannelResponse renameChannelResponse = response.as(RenameChannelResponse.class);
        renameChannelResponse.setHttpStatusCode(response.getStatusCode());
        return renameChannelResponse;
	}
	public  ArchiveChannelResponse archiveChannel(String token,String channelId)
	{
		Reporter.log(String.format("\n archiveChannel URL --- Get %s", SlackAPIs.archiveChannelURL),true);
		Response response = given()
				.queryParam("token",token)
				.queryParam("channel", channelId)
				.contentType(ContentType.JSON)
                .post(SlackAPIs.archiveChannelURL);
		       
		Reporter.log(String.format("\n archiveChannel Response status code --- %s", response.getStatusCode()),true);
		Reporter.log(String.format("\n archiveChannel Response --- %s", response.asString()),true);
		
        ArchiveChannelResponse archiveChannelResponse = response.as(ArchiveChannelResponse.class);
        archiveChannelResponse.setHttpStatusCode(response.getStatusCode());
        return archiveChannelResponse;
}
	}

