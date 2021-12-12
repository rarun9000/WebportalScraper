package jospehsportal;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlButton;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlOption;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlSelect;
import com.gargoylesoftware.htmlunit.html.HtmlTable;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import java.util.ArrayList;

public class Portal {
    // Construcor Arguments: (username,password)
    String username="",password="";
    Portal(String username,String password){
        this.username=username;
        this.password=password;
    }

    Portal() {
    }
    
    public boolean checkserver(){
        java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(java.util.logging.Level.OFF);
        final WebClient wv = new WebClient(BrowserVersion.CHROME);   
         try{
            HtmlPage p=wv.getPage("http://125.17.181.198/");
            String head=p.getHead().asText();
            if(head.equals("Student Portal")){
                wv.close();
                return true;
            }            
         }
         catch(Exception e){
             return false;
         }
         return false;
    }
    
    public boolean checklogin(String uname,String pass){
         java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(java.util.logging.Level.OFF);
        final WebClient wv = new WebClient(BrowserVersion.CHROME);   
         try{
            HtmlPage p=wv.getPage("http://125.17.181.198/");
            HtmlTextInput username=p.getHtmlElementById("cphBody_txtUserName");
            HtmlPasswordInput password=p.getHtmlElementById("cphBody_txtPassword");
            HtmlElement button= p.getHtmlElementById("cphBody_btnLogin");
            username.setText(uname);
            password.setText(pass);
            HtmlPage p2=button.click();
            if((p2.getBaseURL()+"").equals("http://125.17.181.198/StudentView.aspx")){
                return true;
            }           
         }
         catch(Exception e){
             System.out.println("Error "+e);
         }
         return false;
    }
    WebClient wv = new WebClient(BrowserVersion.CHROME);
    public HtmlPage login(){
        java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(java.util.logging.Level.OFF);
        HtmlPage p2 = null;
        try{
            HtmlPage p=wv.getPage("http://125.17.181.198/");
            HtmlTextInput username=p.getHtmlElementById("cphBody_txtUserName");
            HtmlPasswordInput password=p.getHtmlElementById("cphBody_txtPassword");
            HtmlElement button= p.getHtmlElementById("cphBody_btnLogin");
            username.setText(this.username);
            password.setText(this.password);
            p2=button.click();
            //System.out.println(p2);
            //DisplayMarks("1","IAE-1 Unit 1",p2);      
        }
        catch(Exception e){
           System.out.println("Error: " +e);
        }
         return p2;
    }
    
    @SuppressWarnings("empty-statement")
    public String[][] DisplayMarks(String sem, String test,HtmlPage Marks){
        String[][] marks=null;
        try{
                HtmlAnchor Anchor = Marks.getAnchorByHref("MarksView.aspx");                
                HtmlPage p3=Anchor.click();
                
                HtmlSelect sem_element = (HtmlSelect) p3.getElementById("cphBody_ddlSemester");
                sem_element.setSelectedAttribute(sem , true);
                HtmlSelect test_element = (HtmlSelect) p3.getElementById("cphBody_ddlModel");
                test_element.setSelectedAttribute(test, true);
                HtmlElement ok=p3.getHtmlElementById("cphBody_btnOk");
                p3=ok.click();
                //System.out.print("object "+p3.asText());
                HtmlTable table= p3.getHtmlElementById("cphBody_grdMarks");
                int col_count=table.getRow(0).getChildElementCount();
                int row_count=table.getRowCount()-1;
                //System.out.println("No of sub: "+(row_count));
                marks=new String[row_count][col_count];
                for (int row=0;row<row_count;row++) {
                    //System.out.println(table.getRow(row+1).asText());
                    marks[row][0]=table.getCellAt(row+1, 0).asText()+"";
                    marks[row][1]=table.getCellAt(row+1, 1).asText()+"";
                    marks[row][2]=table.getCellAt(row+1, 2).asText()+"";
                    marks[row][3]=table.getCellAt(row+1, 3).asText()+"";                    
                }
                System.out.println();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return marks;
    }
    
    public String[][] FetchNotes(HtmlPage student){
        try{
            HtmlAnchor Anchor = student.getAnchorByHref("NotesView.aspx");                
            HtmlPage notespage=Anchor.click();
            String[] year=null;
            
        }
        catch(Exception e){
            
        }        
        return new String[1][1];
    }
    public String[] FetchNoteYears(HtmlPage student){
        String[] years=null;
        try{
            HtmlAnchor Anchor = student.getAnchorByHref("NotesView.aspx");                
            HtmlPage notespage=Anchor.click();
            DomElement year=notespage.getElementById("cphBody_ddlAcademic");
           
            
            int tot=year.getChildElementCount();
            years=new String[tot];
            int i=0,v=100;
            for(DomElement x:year.getChildElements()){
                if(v==100){
                    v=200;
                    continue;
                }
                years[i]=x.asText();
                //System.out.println(x.asText());
                i++;
            }    
        }
        catch(Exception e){
            
        }        
        return years;
    
    }
    
    public String[] FetchSubjects(HtmlPage student, String sem, String year){
        try{
            
            HtmlAnchor Anchor = student.getAnchorByHref("NotesView.aspx");                
            HtmlPage notespage=Anchor.click();
            HtmlPage Temp=notespage;
            
            HtmlSelect years=Temp.getHtmlElementById("cphBody_ddlAcademic");
            HtmlElement div= Temp.getHtmlElementById("cphBody_Div1");
            HtmlElement btn=(HtmlElement) Temp.createElement("input");
            btn.setAttribute("type", "submit");
            btn.setAttribute("onclick", years.getAttribute("onchange"));
            div.appendChild(btn);
            HtmlOption to_be_selected=years.getOptionByText(year);
            years.removeAllChildren();
            years.appendOption(to_be_selected);
            btn.click();
            // System.out.println("wb\n"+wb.getContentAsString());  
            
            HtmlSelect Semester=Temp.getHtmlElementById("cphBody_ddlSemester");
            HtmlElement div1= Temp.getHtmlElementById("cphBody_Div6");
            HtmlElement btn1=(HtmlElement) Temp.createElement("input");
            btn1.setAttribute("type", "submit");
            btn1.setAttribute("onclick", Semester.getAttribute("onchange"));
            
            div1.appendChild(btn1);
            HtmlOption to_be_selected1=Semester.getOptionByText(sem);
            Semester.removeAllChildren();
            Semester.appendOption(to_be_selected1);
           // System.out.println("yes");
            Temp=btn1.dblClick();

            System.out.println("wb1\n"+Temp.asXml());

                
        }
        catch(Exception e){
            
        }  
        return new String[1];
    }
    
    public void close(){
        try{
             wv.close();
        }
        catch(Exception e){
       
        }
    }
}
