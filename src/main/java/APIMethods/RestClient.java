package APIMethods;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	
	public void get(String url) throws ClientProtocolException, IOException
	{
		//To create client connection
		CloseableHttpClient httpclient=HttpClients.createDefault();
		
		//To get connection with url
		HttpGet httpget= new HttpGet(url);
		CloseableHttpResponse closablehttpres= httpclient.execute(httpget);
		
		//to get status code
		int statuccode=closablehttpres.getStatusLine().getStatusCode();
		System.out.println("status code is "+statuccode);
		
		String resstring=EntityUtils.toString(closablehttpres.getEntity(),"UTF-8");
		
		
		//To convert response payload string to JSON
		JSONObject JsonObj=new JSONObject(resstring);
		System.out.println("Response payload is" +JsonObj);
		//To get headers
		Header[] harr=closablehttpres.getAllHeaders();
		
		//To read headers will put them in Hashmap
		HashMap<String,String> map=new HashMap<String,String>();
		
		for(Header i:harr)
		{
			map.put(i.getName(), i.getValue());
		}
		
		System.out.println("Headers Array"+map);
	}
	
}
