package Operations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Excel.Excell;
import Repository.InspectElements;
import Repository.OpenBrowser;
//import Repository.InspectElements;

public class LoginOperations {
	static String s;
	static String s1;
	//static WebDriver driver;
	public  static void actions() throws Exception {
	
		Excell.Code("Test Data for Admin Login", "C:\\Users\\NSSS KKISHORE\\Downloads\\CubicIT Website Project.xlsx");
		s=Excell.RowColumn1(2, 1);
		Thread.sleep(3000);
		InspectElements.user().sendKeys(s);
		s=Excell.RowColumn1(2, 2);
		Thread.sleep(3000);
		InspectElements.pswd().sendKeys(s);
		Thread.sleep(3000);
InspectElements.Btn().click();
Thread.sleep(3000);
InspectElements.profile().click();
		Excell.Code("TestData For Profile", "C:\\Users\\NSSS KKISHORE\\Downloads\\CubicIT Website Project.xlsx");
		s=Excell.RowColumn1(2, 1);
		Thread.sleep(3000);
		InspectElements.name().clear();
		Thread.sleep(3000);
InspectElements.name().sendKeys(s);
		s=Excell.RowColumn1(2, 3);
		Thread.sleep(3000);
		InspectElements.email().clear();
		Thread.sleep(3000);
InspectElements.email().sendKeys(s);
		s=Excell.RowColumn1(2, 4);
		Thread.sleep(3000);
		InspectElements.password().clear();
		Thread.sleep(3000);
InspectElements.password().sendKeys(s);
		s=Excell.RowColumn1(2, 5);
		Thread.sleep(3000);
		InspectElements.confirmpassword().clear();
		Thread.sleep(3000);
InspectElements.confirmpassword().sendKeys(s);
Thread.sleep(3000);
InspectElements.update().click();
Thread.sleep(3000);
InspectElements.reset().click();
Thread.sleep(3000);
InspectElements.java().click();
Thread.sleep(3000);
InspectElements.questions().click();
Thread.sleep(3000);
InspectElements.cuttoffmarks().click();
Thread.sleep(3000);
InspectElements.serverOn().click();
Reporter.log("Clicked on server on button");

	}
public static void actions1() throws Exception {
	InspectElements.signin().click();
Excell.Code(" Test Data for USER LOGIN", "C:\\Users\\NSSS KKISHORE\\Downloads\\CubicIT Website Project.xlsx");
s=Excell.RowColumn1(4, 1);

InspectElements.email1().sendKeys(s);
s=Excell.RowColumn1(4, 2);

InspectElements.password1().sendKeys(s);
InspectElements.signin1().click();
/*InspectElements.usersignout().click();
InspectElements.userlogout1().click();
*/
InspectElements.exam().click();





/*System.out.println(OpenBrowser.driver.getCurrentUrl());
InspectElements.exam().click();
Thread.sleep(3000);
System.out.println(OpenBrowser.driver.getCurrentUrl());*/
	}

public static void nexttab() throws Exception  {

	/*Robot r= new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_1);
	OpenBrowser.close();*/
	//OpenBrowser.open2();
	InspectElements.startexam().click();
	System.out.println(OpenBrowser.driver.getCurrentUrl());
	
}

/*}
public static  void scrollbottom() throws Exception {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	Thread.sleep(3000);*/
//System.out.println(OpenBrowser.driver.getCurrentUrl());

  /*InspectElements.startexam().click();
  
    System.out.println(OpenBrowser.driver.getCurrentUrl());

*/

	
	public static void actions2() throws Exception{
		Excell.Code("Test Data for Admin Login", "C:\\Users\\NSSS KKISHORE\\Downloads\\CubicIT Website Project.xlsx");
		s=Excell.RowColumn1(2, 1);
		Thread.sleep(3000);
		InspectElements.user().sendKeys(s);
		s=Excell.RowColumn1(2, 2);
		Thread.sleep(3000);
		InspectElements.pswd().sendKeys(s);
		Thread.sleep(3000);
InspectElements.Btn().click();
Thread.sleep(3000);
InspectElements.java().click();
Thread.sleep(3000);
InspectElements.questions().click();
Thread.sleep(3000);
InspectElements.view().click();
Thread.sleep(4000);
InspectElements.addjavaquestions().click();
Excell.Code("Test Data For Add Questions ", "C:\\Users\\NSSS KKISHORE\\Downloads\\CubicIT Website Project.xlsx");
s=Excell.RowColumn1(1, 1);
Thread.sleep(3000);
InspectElements.addquestions().sendKeys(s);
s=Excell.RowColumn1(2, 1);
Thread.sleep(3000);
InspectElements.optionA().sendKeys(s);
s=Excell.RowColumn1(3, 1);
Thread.sleep(3000);
InspectElements.optionB().sendKeys(s);
s=Excell.RowColumn1(4, 1);
Thread.sleep(3000);
InspectElements.optionC().sendKeys(s);
s=Excell.RowColumn1(5, 1);
Thread.sleep(3000);
InspectElements.optionD().sendKeys(s);
s=Excell.RowColumn1(6, 1);
Thread.sleep(3000);
InspectElements.correctanswer().sendKeys(s);
Thread.sleep(3000);
InspectElements.updatequestion().click();
Thread.sleep(4000);
InspectElements.questions1().click();
Thread.sleep(3000);
InspectElements.cuttoffmarks1().click();
Thread.sleep(3000);
Excell.Code("Test Data for cuttoff marks ", "C:\\Users\\NSSS KKISHORE\\Downloads\\CubicIT Website Project.xlsx");
s=Excell.RowColumn1(1, 1);
Thread.sleep(3000);
InspectElements.cuttoff().clear();
Thread.sleep(3000);
InspectElements.cuttoff().sendKeys(s);
Thread.sleep(3000);
InspectElements.updateQ1().click();
s=Excell.RowColumn1(2, 1);
Thread.sleep(3000);
InspectElements.updatequestionlimit().clear();
Thread.sleep(3000);
InspectElements.updatequestionlimit().sendKeys(s);
Thread.sleep(3000);
InspectElements.updateQ2().click();
s=Excell.RowColumn1(3, 1);
Thread.sleep(3000);
InspectElements.updatetimeforexam().clear();
Thread.sleep(3000);
InspectElements.updatetimeforexam().sendKeys(s);
Thread.sleep(3000);
InspectElements.updateQ3().click();
Thread.sleep(3000);
InspectElements.serverOn().click();

}
	public static void actions3() throws Exception{
		InspectElements.home().click();
		Thread.sleep(5000);
		InspectElements.aboutus().click();
		Thread.sleep(5000);
		InspectElements.events().click();
		Thread.sleep(5000);
		InspectElements.technologies().click();
		Thread.sleep(5000);
		InspectElements.contact().click();
		Thread.sleep(5000);
		InspectElements.signin().click();
		Thread.sleep(3000);
		InspectElements.closeWindow().click();
		Thread.sleep(5000);
		InspectElements.signup().click();

		
	}

	}
		
		
		
		



