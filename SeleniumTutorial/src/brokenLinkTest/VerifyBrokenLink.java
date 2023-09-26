
package brokenLinkTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class VerifyBrokenLink {
 
 int validLink=0;
 int invalidLink=0;

 public void verifyBrokenLinks(String linkURL) {
  
  try {
   URL url = new URL(linkURL);
   HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
   httpURLConnect.connect();

   int respCode = httpURLConnect.getResponseCode();

   if (respCode >= 400) {
    System.out.println(linkURL + ": is a broken link" + "---" + httpURLConnect.getResponseMessage()+ "---" + httpURLConnect.getResponseCode());
    invalidLink=invalidLink+1;
   } else {
    System.out.println(url + ": is a valid link" + "---" + httpURLConnect.getResponseMessage()+ "---" + httpURLConnect.getResponseCode());
    validLink=validLink+1;
   }
   httpURLConnect.disconnect();
  } catch (MalformedURLException e) {
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  }  
 }
}