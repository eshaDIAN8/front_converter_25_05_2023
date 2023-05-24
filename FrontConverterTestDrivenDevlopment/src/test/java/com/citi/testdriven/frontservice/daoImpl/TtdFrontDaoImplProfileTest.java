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

/*@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
@ExtendWith(SpringExtension.class)
@ActiveProfiles(value = "test")*/
public class TtdFrontDaoImplProfileTest {
	
	@Autowired
	TtdFrontDao dao = new TtdFrontDaoImplStatic();
	
	@Autowired
	TtdFrontDaoImplStatic daoImplStatic;
	

	public void testProfile() {
		String convertedUnit ="km-meter";
		
		daoImplStatic.getFormula(convertedUnit);
		System.out.println("inside TtdFrontDaoImplProfileTest::"
		+dao.getFormula(convertedUnit));
		
		
	}

}
