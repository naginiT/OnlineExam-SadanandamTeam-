package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InspectElements extends OpenBrowser{

	static By user=By.name("email");
	static By pswd=By.id("userPw");
	static By loginBtn=By.cssSelector("#reg_form > fieldset > div:nth-child(3) > div > button.btn.btn-success.btn-lg");
	static By profile= By.cssSelector("#bs-example-navbar-collapse-1 > ul > li:nth-child(2) > a > span");
	static By FullNname =By.name("name");
	static By email =By.name("email");
	static By password =By.id("userPw");
	static By confirmpassword =By.name("confirmPassword");
	static By update =By.cssSelector("#reg_form > fieldset:nth-child(3) > div:nth-child(4) > div > button.btn.btn-large.btn-success");
	static By reset =By.cssSelector("#reg_form > fieldset:nth-child(3) > div:nth-child(4) > div > button.btn.btn-large.btn-warning");
	static By java =By.cssSelector("#bs-example-navbar-collapse-1 > ul > li:nth-child(3) > a > span");
	static By testing=By.cssSelector("#bs-example-navbar-collapse-1 > ul > li:nth-child(5) > a > span");
	static By questions =By.cssSelector("#bs-example-navbar-collapse-1 > ul > li.dropdown > a > span");
	static By questions1=By.cssSelector("#bs-example-navbar-collapse-1 > ul > li.active > a > span");
	static By view=By.cssSelector("#bs-example-navbar-collapse-1 > ul > li.dropdown.open > ul > li:nth-child(1) > a");
	static By cuttoffmarks =By.cssSelector("#bs-example-navbar-collapse-1 > ul > li.dropdown.open > ul > li:nth-child(2) > a");
	static By cuttoffmarks1 =By.cssSelector("#bs-example-navbar-collapse-1 > ul > li.active.open > ul > li:nth-child(2) > a");
	static By addjavaquestions=By.cssSelector("body > a.button");
	static By addquestions=By.name("question");
	static By optionA=By.name("a");
	static By optionB=By.name("b");
	static By optionC=By.name("c");
	static By optionD=By.name("d");
	static By correctanswer=By.name("answer");
	static By updatequestions=By.cssSelector("body > form > input");
	static By cuttoff=By.name("marks");
	static By updateQ1=By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[4]/font/input");
	static By updateQ2=By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[4]/font/input");
	static By updateQ3=By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[4]/font/input");
	static By UpdateQuestionLimit=By.name("limit");
	static By UpdateTimeForExam=By.name("time");
	static By serveron=By.xpath("/html/body/div[2]/table/tbody/tr[4]/td[3]/font/input");
	static By serveroff =By.xpath("/html/body/div[2]/table/tbody/tr[4]/td[4]/font/input");
	static By signin=By.cssSelector(".w3layouts_header_left > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)");
	static By email1=By.name("email");
	static By password1=By.name("password");
	static By signin1=By.cssSelector(".tp > input:nth-child(1)");
	static By exam=By.cssSelector("#bs-example-navbar-collapse-1 > ul > li:nth-child(3) > a > span");
    static By startexam=By.xpath("/html/body/center/form/input");
    static By home=By.cssSelector("#bs-example-navbar-collapse-1 > ul > li:nth-child(1) > a > span");
    static By aboutus=By.cssSelector("#bs-example-navbar-collapse-1 > ul > li.active > a > span");
    static By events=By.cssSelector("#bs-example-navbar-collapse-1 > ul > li:nth-child(3) > a > span");
    static By technologies=By.cssSelector("#bs-example-navbar-collapse-1 > ul > li.dropdown > a > span");
    static By contact=By.cssSelector("#bs-example-navbar-collapse-1 > ul > li:nth-child(5) > a > span");
    static By signup=By.cssSelector("body > nav > div.header > div.w3layouts_header_left > ul > li:nth-child(2) > a");
    static By closewindow=By.cssSelector("#myModal2 > div > div > div > button");
    static By usersignout=By.cssSelector("body > nav > div.header > div.w3layouts_header_left > ul > li:nth-child(2) > a");
    static By userlogout1=By.cssSelector("#myModal2 > div > div > div > div.signin-form.profile > div > form > input[type='submit']");
public static WebElement user() {
	
	return driver.findElement(user);
	
}

public static WebElement pswd() {
	
	return driver.findElement(pswd);
	
} 

public static WebElement Btn() {    
	
		return driver.findElement(loginBtn);
	
}
public static WebElement profile() {    
	
	return driver.findElement(profile);

}
public static WebElement name() {    
	
	return driver.findElement(FullNname);

}
public static WebElement email() {    
	
	return driver.findElement(email);

}
public static WebElement password() {    
	
	return driver.findElement(password);

}
public static WebElement confirmpassword() {    
	
	return driver.findElement(confirmpassword);

}
public static WebElement update() {    
	
	return driver.findElement(update);

}
public static WebElement reset() {    
	
	return driver.findElement(reset);
	//System.out.println("Clicked on reset");
	
}
public static WebElement java() {    
	
	return driver.findElement(java);

}
public static WebElement testing() {    
	
	return driver.findElement(testing);

}
public static WebElement questions() {    
	
	return driver.findElement(questions);

}
public static WebElement questions1() {    
	
	return driver.findElement(questions1);

}
public static WebElement view() {    
	
	return driver.findElement(view);

}
public static WebElement cuttoffmarks() {    
	
	return driver.findElement(cuttoffmarks);

}
public static WebElement cuttoffmarks1() {    
	
	return driver.findElement(cuttoffmarks1);

}

public static WebElement addjavaquestions() {    
	
	return driver.findElement(addjavaquestions);

}
public static WebElement addquestions() {    
	
	return driver.findElement(addquestions);

}
public static WebElement optionA() {    
	
	return driver.findElement(optionA);

}
public static WebElement optionB() {    
	
	return driver.findElement(optionB);

}
public static WebElement optionC() {    
	
	return driver.findElement(optionC);

}
public static WebElement optionD() {    
	
	return driver.findElement(optionD);

}
public static WebElement correctanswer() {    
	
	return driver.findElement(correctanswer);

}
public static WebElement updatequestion() {    
	
	return driver.findElement(updatequestions);

}
public static WebElement cuttoff() {    
	
	return driver.findElement(cuttoff);

}
public static WebElement updateQ1() {    
	
	return driver.findElement(updateQ1);

}
public static WebElement updatequestionlimit() {    
	
	return driver.findElement(UpdateQuestionLimit);

}
public static WebElement updateQ2() {    
	
	return driver.findElement(updateQ2);

}
public static WebElement updatetimeforexam() {    
	
	return driver.findElement(UpdateTimeForExam);

}
public static WebElement updateQ3() {    
	
	return driver.findElement(updateQ3);

}
public static WebElement serverOn() {    
	
	return driver.findElement(serveron);

}
public static WebElement serverOff() {    
	
	return driver.findElement(serveroff);

}
public static WebElement signin() {    
	
	return driver.findElement(signin);

}
public static WebElement email1() {    
	
	return driver.findElement(email1);

}
public static WebElement password1() {    
	
	return driver.findElement(password1);

}
public static WebElement signin1() {    
	
	return driver.findElement(signin1);

}
public static WebElement exam() {    
	
	return driver.findElement(exam);

}
public static WebElement startexam() {    
	
	return driver.findElement(startexam);

}
public static WebElement home() {    
	
	return driver.findElement(home);

}
public static WebElement aboutus() {    
	
	return driver.findElement(aboutus);

}
public static WebElement events() {    
	
	return driver.findElement(events);

}
public static WebElement technologies() {    
	
	return driver.findElement(technologies);

}
public static WebElement contact() {    
	
	return driver.findElement(contact);

}
public static WebElement signup() {    
	
	return driver.findElement(signup);

}
public static WebElement closeWindow() {    
	
	return driver.findElement(closewindow);

}
public static WebElement usersignout() {    
	
	return driver.findElement(usersignout);

}
public static WebElement userlogout1() {    
	
	return driver.findElement(userlogout1);

}

}


