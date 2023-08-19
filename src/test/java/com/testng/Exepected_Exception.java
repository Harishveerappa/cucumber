package com.testng;

import org.testng.annotations.Test;

public class Exepected_Exception {
	@Test(expectedExceptions = ArithmeticException.class)
private void demo() {
	int a=10;
	System.out.println(a/0);
	
}
}
