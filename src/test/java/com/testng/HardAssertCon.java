package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertCon {
	@Test
private void demo() {
	String exp= "Harish";
	String act="Harish123";
			Assert.assertEquals(act, exp);
			System.out.println("Validitation"); {
				
			}
	
}
}
