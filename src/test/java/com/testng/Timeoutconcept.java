package com.testng;

import org.testng.annotations.Test;

public class Timeoutconcept {
@Test(timeOut=8000)
private void login() throws InterruptedException{
	Thread.sleep(5000);
	System.out.println("BrowserLaunch");
	Thread.sleep(1000);
	System.out.println("Url Launch");
	Thread.sleep(1500);
	System.out.println("Login");
}
}
