package com.citi.testdriven;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

import com.citi.testdriven.frontservice.controller.TtdFrontController;
import com.citi.testdriven.frontservice.service.TtdFrontService;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
@ExtendWith(SpringExtension.class)
class FrontConverterTestDrivenDevlopmentApplicationTests {



	@Mock
  private RestTemplate restTemplate ;

	@Mock
	private ResponseEntity<String> responseEntity ;
	
	@Test
	void contextLoads() {
								
	}
	
		    @Test
			public void test1_Component_Testing() throws Exception {	
		    	
				//ResponseEntity<String> responseCrud = new ResponseEntity("*100", HttpStatus.OK);
				    	
				String uri = "http://localhost:8089/converter/meter/cm/7";	
				when(restTemplate.getForEntity(uri, String.class))
				.thenReturn(new ResponseEntity(Mockito.anyString(), HttpStatus.OK));
				
		    //ResponseEntity<String> result=	restTemplate.getForEntity(uri, String.class);
		    	
		        //Assert.assertEquals(200,responseEntity.getStatusCodeValue());
			   
			 
		    
		    }	    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    //  ResponseEntity<String> responseFront = new ResponseEntity("700",HttpStatus.OK);
				
			        /* MvcResult mvcResult =  (MvcResult) mockMvc
						.perform(MockMvcRequestBuilders.get(frontUri,"meter","cm","7"))
						.andExpect(MockMvcResultMatchers.status().isOk())
						.andExpect(MockMvcResultMatchers.content().string("700.0")).andReturn();	
					*/
				
			   /* System.out.println("mvcResult::"+mvcResult.getResponse().getContentAsString());		 
			    Assert.assertEquals(HttpStatus.OK.value(),mvcResult.getResponse().getStatus());
				*/
		
		 
		    
		
	

	
	/*
	@Test public void greetingShouldReturnDefaultMessage() throws Exception
	{ 
		
		assertThat(this.restTemplate.
			getForObject("http://localhost:" + port + "/", 
					String.class)).contains("Hello, World"); }
}*/

}