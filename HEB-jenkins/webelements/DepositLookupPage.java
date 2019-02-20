package webelements;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseWeb;
import generic.Utility;


public class DepositLookupPage extends BaseWeb {
	
	@Test
	public void depTapeLookup() throws Exception {
	
	//to navigate to DepositTape screen
	String menu="btnHeaderToggleMenuDivCollapseExpand";
	String linkText="Finance";
	String linTxt="Deposit";
	driver.findElement(By.id(menu)).click();
	driver.findElement(By.linkText(linkText)).click();
	driver.findElement(By.linkText(linTxt)).click();
	Thread.sleep(5000);
	
	   //to get all the web elements tag names
		List<WebElement> all = driver.findElements(By.xpath("//*"));
		Reporter.log("Total available webelements are "+all.size(),true);
		
		//to write total count to excel
		int r=all.size()+2;
		int c=0;
		Utility.writeCountToXL(OUTPUT_PATH, "count", r, c, all.size());

        //adding all tags to tree set
	     Set<String> tags=new TreeSet<String>();
		  for(WebElement al:all) {
		    	String name=al.getTagName();
			    tags.add(name); 
			}
		  Reporter.log("Total tags are "+tags.size(),true);
		  
		    //to get each tag count and write to excel sheet
		    int count=0;
		    int countrow=2,countcol=4;
	        ArrayList<String> list = new ArrayList<String>(tags);  
	        for(int i=0;i<list.size();i++) {
	        	String tn = list.get(i);
	     
	        	  count=0;
	        	  for(WebElement al:all) {
	        		  if(al.getTagName().equals(tn)) {
	        			  count++;
	        			 
	        		  }
	        	  }
	        	  Utility.writeCountToXL(OUTPUT_PATH, "count",countrow ,countcol, count);
	        	  countrow++;
	        	 
	        	  Reporter.log("Total available "+tn+" are "+ count,true);

	        }
	       
	        //to get each tag name and write to excel sheet
	        int tagrow=2,tagcol=4;
	        for(int j=0;j<list.size();j++) {
	        	String tn = list.get(j);
	        	 Utility.writeTagsToXL(OUTPUT_PATH, "tag", tagrow, tagcol, tn);	
	        	 tagrow++;
	        }
	       
	      
	  }
	
		
}
	
