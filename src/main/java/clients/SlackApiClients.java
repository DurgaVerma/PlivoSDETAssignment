package clients;

import static io.restassured.RestAssured.given;

import org.testng.Reporter;

import entites.createChannel.CreateChannelResponse;
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
	
	
	
	

	
}
