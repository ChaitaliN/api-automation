import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import APIMethods.RestClient;
import TestBasePackage.TestBase;

public class GetAPI extends TestBase {

	//public String url;
	TestBase tb;
	String url;
	
	@BeforeMethod
	public void SetUp() {
	tb=new TestBase();
	  url=prop.getProperty("url");
	}
	
	@Test
	public void getAPI() throws ClientProtocolException, IOException
	{
		RestClient restclient =new RestClient();
		restclient.get(url);
	}
	
}
