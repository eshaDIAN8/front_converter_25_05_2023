package com.citi.testdriven.frontservice.daoImpl;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.citi.testdriven.frontservice.dao.TtdFrontDao;

//@AutoConfigureMockMvc
@RunWith(MockitoJUnitRunner.class)
@ExtendWith(SpringExtension.class)
//@SpringBootTest
@ActiveProfiles(value = "test")
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TtdFront_Dao_Impl_Mock_Integration_Test {
	
	
	@Value(value="${local.server.port}")
	private int port;
	
    @InjectMocks
	private TtdFrontDaoImplStatic daoImpl;
    
    @Mock
   private  TtdFrontDao dao = new TtdFrontDaoImplStatic();
		
	
	
	@Mock
	private TestRestTemplate testRestTemp ;
	
	@Mock
	ResponseEntity<String> responseEntity  ;
	
	
	@Test
	public void getFormulaStaticData() {
		
		String convertedUnit ="meter-cm";	
		
		String uri = "http://localhost:8080/getConvertedUnit/meter-cm";	
		
    	when(testRestTemp.getForEntity(uri, String.class)).
    	thenReturn(new ResponseEntity(Mockito.anyString(),HttpStatus.OK));
    	
    	
    	String formula = dao.getFormula(convertedUnit);
    //	System.out.println("formula::"+formula);
		 
		 Assert.assertEquals(responseEntity.getBody(),formula );
		
		
		
	}
	


}
