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
public class MainRun {
    public static void main(String... args){
        netconnection net=new netconnection();
        if(net.connection()){
            SimpleSwingBrowser1 browser=new SimpleSwingBrowser1();
            browser.main(null);
        }else{
         LogInPage log=new LogInPage();
         log.main(null);
        }
   
    }
}
