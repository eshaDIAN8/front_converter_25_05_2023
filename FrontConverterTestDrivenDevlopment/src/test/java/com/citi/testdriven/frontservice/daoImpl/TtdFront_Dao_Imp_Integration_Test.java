package com.citi.testdriven.frontservice.daoImpl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.citi.testdriven.frontservice.dao.TtdFrontDao;





@RunWith(MockitoJUnitRunner.class)
@ExtendWith(SpringExtension.class)
@ActiveProfiles(value = "test")
@ContextConfiguration
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TtdFront_Dao_Imp_Integration_Test {
	
	
	@Value(value="${local.server.port}")
	private int port;
  
/*	@Value("${profile.property.value}")
    private String propertyString;*/
	
	//@Autowired
	TtdFrontDaoImplStatic daoImpl  = new TtdFrontDaoImplStatic();
	
	@Autowired
	TtdFrontDao dao = new TtdFrontDaoImplStatic();
	
	//hv to move static java class into test folder
	//hv to mock resttemplate in integration
	//one is real response in integration
	//componnet stub resttemplate
	
	
	@Test
	public void testIntegrationgetFormula() {
		String convertedUnit = "km-meter";
		String formula = dao.getFormula(convertedUnit);
		
		System.out.println("getting formula from crud service::"+formula); 
		 Assert.assertEquals("*1000",formula );
		
	}
	
	
	
	
	
	

}
