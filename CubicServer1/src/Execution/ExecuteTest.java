package Execution;

//import java.awt.LinearGradientPaint;

import org.testng.annotations.Test;

import Operations.LoginOperations;
import Repository.OpenBrowser;
public class ExecuteTest {
	@Test
	public void Exe() throws Exception{
		OpenBrowser.browser();
		OpenBrowser.maximize();
		OpenBrowser.open();
		LoginOperations.actions();
		OpenBrowser.browser();
		OpenBrowser.open1();
		OpenBrowser.maximize();
		LoginOperations.actions1();
		OpenBrowser.open2();
		OpenBrowser.maximize();
		LoginOperations.nexttab();
		//LoginOperations.scrollbottom();
		OpenBrowser.browser();
		OpenBrowser.maximize();
		OpenBrowser.open();
		LoginOperations.actions2();
		OpenBrowser.browser();
		OpenBrowser.open1();
		OpenBrowser.maximize();
		LoginOperations.actions3();
	}
}
