/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jospehsportal;

import com.gargoylesoftware.htmlunit.html.HtmlPage;
import java.util.Arrays;



/**
 *
 * @author RK
 */
public class JospehsPortal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Portal p=new Portal("19it152","3md4ue548");
          HtmlPage page=p.login();
          //System.out.println(page);
         // Portal x=new Portal();
          //String[][] x=p.DisplayMarks("1", "IAE-1 Unit 1", page);
          //for(String[] v:x){
          //  System.out.println(Arrays.toString(v));
            
          //1475192960
         // }
         //System.out.println(Arrays.toString(p.FetchNoteYears(page)));
          p.FetchSubjects(page, "3","2020 - 2021");
}
}
