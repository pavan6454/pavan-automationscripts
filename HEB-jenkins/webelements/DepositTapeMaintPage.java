package webelements;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseWeb;
import generic.Utility;

public class DepositTapeMaintPage extends BaseWeb{
	@Test
	public void depTapeMaint() throws Exception {
		
		//to navigate to DepositTapeMaint screen
		String menu="btnHeaderToggleMenuDivCollapseExpand";
		String linkText="Finance";
		String linTxt="Deposit Tape";
		driver.findElement(By.id(menu)).click();
		driver.findElement(By.linkText(linkText)).click();
		driver.findElement(By.linkText(linTxt)).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnNew")).click();
		
		//Explicit wait
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("maintenance"));
		

		    //to get all the web elements tag names
			List<WebElement> all1 = driver.findElements(By.xpath("//*"));
			Reporter.log("Total available webelements are "+all1.size(),true);
			
			//to write total count to excel
			int r=all1.size()+2;
			int c=0;
			Utility.writeCountToXL(OUTPUT_PATH, "count", r, c, all1.size());

	        //adding all tags to tree set
		     Set<String> tags1=new TreeSet<String>();
			  for(WebElement al1:all1) {
			    	String name1=al1.getTagName();
				    tags1.add(name1); 
				    
				}
			  Reporter.log("Total tags are "+tags1.size(),true);
			  
			    //to get each tag count and write to excel sheet
			    int count=0;
			    int countrow=2,countcol=5;
		        ArrayList<String> list1 = new ArrayList<String>(tags1);  
		        for(int i=0;i<list1.size();i++) {
		        	String tn2 = list1.get(i);
		     
		        	  count=0;
		        	  for(WebElement al2:all1) {
		        		  if(al2.getTagName().equals(tn2)) {
		        			  count++;
		        			 
		        		  }
		        	  }
		        	  Utility.writeCountToXL(OUTPUT_PATH, "count",countrow ,countcol, count);
		        	  countrow++;
		        	 
		        	  Reporter.log("Total available "+tn2+" are "+ count,true);

		        }
		        
		        //to get each tag name and write to excel sheet
		        int tagrow=2,tagcol=5;
		        for(int j=0;j<list1.size();j++) {
		        	String tn3 = list1.get(j);
		        	 Utility.writeTagsToXL(OUTPUT_PATH, "tag", tagrow, tagcol, tn3);	
		        	 tagrow++;
		        }

      }
}
