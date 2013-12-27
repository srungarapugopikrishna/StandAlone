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
import java.io.File;
 
public class ListFiles extends Thread 
{
 
    public void run(){
        System.out.println("Thred ListFiles Running....");
         String path = "D:\\pcs\\ZipFiles"; 
 
  String files;
  File folder = new File(path);
  File[] listOfFiles = folder.listFiles(); 
 
  for (int i = 0; i < listOfFiles.length; i++) 
  {
 
   if (listOfFiles[i].isFile()) 
   {
   files = listOfFiles[i].getName();
   files= path+"/"+files;
   System.out.println("File in path--"+files);
   System.out.println(files);
   GreetingClient.main(files);
      }
  }
    }
 public static void main(String[] args) 
{
 
  // Directory path here
  String path = "D:\\pcs\\ZipFiles"; 
 
  String files;
  File folder = new File(path);
  File[] listOfFiles = folder.listFiles(); 
 
  for (int i = 0; i < listOfFiles.length; i++) 
  {
 
   if (listOfFiles[i].isFile()) 
   {
   files = listOfFiles[i].getName();
   files= path+"/"+files;
   System.out.println("File in path--"+files);
   System.out.println(files);
   GreetingClient.main(files);
      }
  }
}
}