package entites;

import org.testng.Assert;

public class BaseResponse {
private int httpStatusCode;
	
	public void verifyStatusCode(int statusCode)
	{
		Assert.assertEquals(getHttpStatusCode(), statusCode);
	}

	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

}
