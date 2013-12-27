/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Gopi
 */
public class VideoNameFromHtml {
   public static String main()throws IOException 
	{
		FileInputStream f=new FileInputStream("D:\\pcs\\a.html");
		DataInputStream d=new DataInputStream(f);
                String VideoName ="";
		while(d.available()!=0)
		{
                    String s=d.readLine();
                    System.out.println(s);
                    s=s.substring(76);
                    int i=0;
                    while(!s.subSequence(i, i+1).equals(".")){
                        System.out.println(s.charAt(i));
                        VideoName=VideoName+s.charAt(i);
                        i++;
                    }
                    
                    
		}
		d.close();
             return VideoName;   
        }
}
