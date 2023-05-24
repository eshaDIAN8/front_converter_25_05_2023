package com.citi.testdriven.frontservice.daoImpl;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.citi.testdriven.frontservice.dao.TtdFrontDao;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
@ExtendWith(SpringExtension.class)
@ActiveProfiles(value = "test")
public class TtdFrontDaoImplProfileTest {
	
	@Autowired
	TtdFrontDao dao;
	
	
	@Bean
	public void testProfile() {
		String convertedUnit ="km-meter";
		
		dao.getFormula(convertedUnit);
		
		
	}

}
