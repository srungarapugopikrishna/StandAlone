/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author Gopi
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
 import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class UploadStartUP extends Thread {
  public void run(){
  
       try {
     String url1 ="http://172.16.5.133:8084//dummyt/index.jsp";
		 String charset = "UTF-8";
    	  URL url = new URL(url1);
                
                 HttpURLConnection con =(HttpURLConnection) url.openConnection();
		 con.setRequestProperty("Accept-Charset", charset);
                System.out.println("1---1----1-----1");
		 con.setDoInput(true);
		 con.setDoOutput(true);
		 con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
             try (DataInputStream input = new DataInputStream(con.getInputStream())) {
                 String str;
                 while (null != ((str = input.readLine()))) {
                 System.out.println("->---"+str);
                 }
             }
		 } catch (MalformedURLException ex) {
		 } catch (IOException ex) {
			 System.out.println("Exception---"+ex);
		 }
  
  }
    public static void main(){   
//	 try {
//     String url1 ="http://172.16.5.133:8084//dummyt/index.jsp";
//		 String charset = "UTF-8";
//    	  URL url = new URL(url1);
//                
//                 HttpURLConnection con =(HttpURLConnection) url.openConnection();
//		 con.setRequestProperty("Accept-Charset", charset);
//                System.out.println("1---1----1-----1");
//		 con.setDoInput(true);
//		 con.setDoOutput(true);
//		 con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//             try (DataInputStream input = new DataInputStream(con.getInputStream())) {
//                 String str;
//                 while (null != ((str = input.readLine()))) {
//                 System.out.println("->---"+str);
//                 }
//             }
//		 } catch (MalformedURLException ex) {
//		 } catch (IOException ex) {
//			 System.out.println("Exception---"+ex);
//		 }
  }
}