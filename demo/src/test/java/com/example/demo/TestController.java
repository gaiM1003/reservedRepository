
package com.example.demo;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.controller.SonemTestController;
import com.example.test.AppleInterface;

@SpringBootTest
public class TestController {
	 
	private SonemTestController testController;
	
	@Autowired
	@Qualifier("testServiceb")
	public void setTestController(AppleInterface appleInterface){
		testController = new SonemTestController(appleInterface) ;
	}
	
    @Test
	public void execTest() {
		assertEquals(testController.view(), "ok");
	}
}
