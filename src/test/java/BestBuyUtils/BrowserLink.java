package BestBuyUtils;

import java.net.URL;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;

public class BrowserLink {
	@Test

	public void brokenLinkBestbuy()
	{
	 String urlToCheck = "https://www.bestbuy.com/";
	 //String URL="";

        try {
           URL url = new URL(urlToCheck);
            HttpURLConnection conn= (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("HEAD");
            int responseCode = conn.getResponseCode();

            if (responseCode != HttpURLConnection.HTTP_OK)
            {
                System.out.println("The URL is broken.");
            } 
            else
            {
                System.out.println("The URL is not broken.");
            }
			

        } 
        catch (IOException e) 
        {
        	e.printStackTrace();
		}
}
}
