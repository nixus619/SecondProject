package stepDefinition;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.junit.Assert.*;

public class Definition {
	public boolean duplicate = false;
	
	@Before("@Pass")
	public void beforePass() {
		System.out.println("This message will show up 3 times for each of the scenario outlines using the @Pass Tag");
	}
	
	@Before("@Fail")
	public void beforeFail() {
		System.out.println("This message will show up 2 times for each scenario using the @Fail tag");
	}
	
	@After
	public void CleanUp() throws Exception {
		Runtime.getRuntime().exec("C:/Users/Administrator/Desktop/References/Bat_Files/Lab_6/delete_Job.bat");
	}
	
	@Given("^an ETL Process job$")
	public void loadETLFile() {
		System.out.println("Begin ETL Process job");
	}
	
	@When("^a \"([^\"]*)\" is added to ZCITY$")
	public void addCustomer_ZCITY(String arg1) 	throws Exception { 
    	String line = null;
    
    	Process p = Runtime.getRuntime().exec("C:/Users/Administrator/Desktop/References/Bat_Files/Lab_4/ETL_ZCITY_" + arg1 + ".bat");
    	BufferedReader stdErr = new BufferedReader(new 	InputStreamReader(p.getErrorStream()));
    
    	while ((line = stdErr.readLine()) != null) 	{
    		if(line.contains("ERROR")) { 
	    	 System.out.println(line);
	    	 assertTrue(false);
   	 		}
    	}
    	System.out.println("Customer added to ZCITY");
    	assertTrue(true);
}

 
	@Then("^the \"([^\"]*)\" will be added to the target database$")
	public void addToTarget(String arg1) throws Exception {
    	String line = null;
   	 Process p = Runtime.getRuntime().exec("C:/Users/Administrator/Desktop/References/Bat_Files/Lab_4/ETL_DW_" + arg1 + ".bat");
    
    BufferedReader stdErr = new BufferedReader(new InputStreamReader(p.getErrorStream()));
    
    while ((line = stdErr.readLine()) != null) {
   	 if(line.contains("ERROR")) { 
	    	 System.out.println(line);
	    	 assertTrue(false);
   	 }
    }
    System.out.println("Customer added to Data Warehouse");
    assertTrue(true);
}

	
	@And("^the integrity between the two databases remain$")
	public void integrityCheck() throws Exception {
	     String line = null;
	     Process p = Runtime.getRuntime().exec("cmd.exe /c start /wait C:/Users/Administrator/Desktop/References/Bat_Files/Lab_3/Compare.lnk");
    	 p.waitFor();
    	 File file = new 	File("C:\\Users\\Administrator\\Desktop\\References\\Bat_Files\\Lab_3\\result.txt");
	     BufferedReader std = new BufferedReader(new FileReader(file));
	     while ((line = std.readLine()) != null) {
	    	 if(line.contains("Passed")) {
	    		 System.out.println("The comparison passed");
	    		 assertTrue(true);
	    	 } else 
	    	 {
	    		 System.out.println("The comparison failed");
	    		 assertTrue(false);
	    	 }
	     }
	     std.close();
	}
	@Given("^a customer load file$")
	public void load() throws Exception {
		System.out.println("Begin load job");
	     	Process p = Runtime.getRuntime().exec("C:/Users/Administrator/Desktop/References/Bat_Files/Lab_5/duplicate.bat");
		assertTrue(true);
	}

	@When("^a customer is added$")
	public void addCustomer() throws Exception {
	     String line = null;
	     
	     Process p = Runtime.getRuntime().exec("C:/Users/Administrator/Desktop/References/Bat_Files/Lab_5/ETL_ZCITY.bat");
	     BufferedReader stdErr = new BufferedReader(new InputStreamReader(p.getErrorStream()));
	     
	     while ((line = stdErr.readLine()) != null) {
	    	 if(line.contains("ERROR")) { 
		    	 System.out.println(line);
		    	 assertTrue(false);
	    	 }
	     }
	     System.out.println("Customer added to ZCITY");
	     assertTrue(true);
}	

	@Then("^the data warehouse is checked for duplicates$")
	public void checkDuplicates() throws Exception {
	     String line = null;
	     
	     Process p = Runtime.getRuntime().exec("cmd.exe /c C:/Users/Administrator/Desktop/References/Bat_Files/Lab_5/checkDuplicate.bat");
	     BufferedReader stdErr = new BufferedReader(new InputStreamReader(p.getInputStream()));
	     
	     while ((line = stdErr.readLine()) != null) {
	    	 if((line.contains("1"))) { 
		    	 System.out.println(line);
		    	 duplicate = true;
	    	 }
	     }
}

	@And("^the customer is added to the data warehouse$")
	public void addCustometerDW() throws Exception {
		if(duplicate == false) {
			System.out.println("Adding customer to DW");
		     String line = null;
		     
		     Process p = Runtime.getRuntime().exec("C:/Users/Administrator/Desktop/References/Bat_Files/Lab_5/ETL_DW.bat");
		     BufferedReader stdErr = new BufferedReader(new InputStreamReader(p.getErrorStream()));
		     
		     while ((line = stdErr.readLine()) != null) {
		    	 if(line.contains("ERROR")) { 
			    	 System.out.println(line);
			    	 assertTrue(false);
		    	 }
		     }
		     System.out.println("Customer added to DW");
		     assertTrue(true);
		} else {
			System.out.println("DW already contains customer");
			assertTrue(false);
		}
}
	@When("^a purchase is added to the source")
	public void addPurchase() throws Exception {
		String line = null;
	     
		Process p = 								Runtime.getRuntime().exec("C:/Users/Administrator/Desktop/References/Bat_Files/Lab_5/ETL_Source.bat");
		BufferedReader stdErr = new BufferedReader(new 			InputStreamReader(p.getErrorStream()));
	     
	     while ((line = stdErr.readLine()) != null) {
	    	 if(line.contains("ERROR")) { 
		    	 System.out.println(line);
		    	 assertTrue(false);
	    	 }
	     }
	     System.out.println("Customer added to Source");
	     assertTrue(true);
}

	@Then("^a change occurs in the target$")
	public void addTarget() throws Exception {
	     String line = null;
	     
	     Process p = Runtime.getRuntime().exec("C:/Users/Administrator/Desktop/References/Bat_Files/Lab_5/ETL_Target.bat");
	BufferedReader stdErr = new BufferedReader(new 	InputStreamReader(p.getErrorStream()));
	     
	     while ((line = stdErr.readLine()) != null) {
	    	 if(line.contains("ERROR")) { 
		    	 System.out.println(line);
		    	 assertTrue(false);
	    	 }
	     }
	     System.out.println("Purchase added to Target");
	     assertTrue(true);
}
	@And("^an integrity check is made between the two databases$")
	public void checkIntegrity() throws Exception {
	     String line = null;
	     Process p = Runtime.getRuntime().exec("cmd.exe /c start /wait C:/Users/Administrator/Desktop/References/Bat_Files/Lab_5/Compare.lnk");
	     p.waitFor();
	     File file = new 		File("C:\\Users\\Administrator\\Desktop\\References\\Bat_Files\\Lab_5\\result.txt");
	     BufferedReader std = new BufferedReader(new 		FileReader(file));
	     while ((line = std.readLine()) != null) {
	    	 if(line.contains("Passed")) {
	    		 System.out.println("The comparison passed");
	    		 assertTrue(true);
	    	 } else 
	    	 {
	    		 System.out.println("The comparison failed");
	    		 assertTrue(false);
	    	 }
	     }
}

}
