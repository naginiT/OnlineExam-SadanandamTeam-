package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	public static WebDriver driver;
	public static void browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NSSS KKISHORE\\Desktop\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	public static void open() {                      
	driver.get("http://localhost:8082/OnlineHibernate/adminlogin.jsp");
	}
	public static  void maximize() { 
		driver.manage().window().maximize();
	}
	public static  void close() { 
		driver.close();
	}
	public static void open1() {                      
		driver.get("http://localhost:8082/OnlineHibernate/index.jsp");
		}
	
	public static void open2() {                      
		driver.get("http://localhost:8082/OnlineHibernate/instructions.jsp");
		}
	
	
	
	}
	
	

