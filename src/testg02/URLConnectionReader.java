package testg02;

import java.io.*;
import java.net.*;

public class URLConnectionReader {
public static void main(String[] args) throws Exception {
   URL site = new URL("http://www.naver.com");
   URLConnection url= site.openConnection();
   BufferedReader in =new BufferedReader(
                    new InputStreamReader(
                          url.getInputStream(),"utf8"));
   String inLine;
   
   while ((inLine=in.readLine())!=null) 
      System.out.println(inLine);
   in.close();
      
}
}