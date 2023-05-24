package com.citi.testdriven.frontservice.daoImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.citi.testdriven.frontservice.dao.TtdFrontDao;

@Component
@Profile("test")
public class TtdFrontDaoImplStatic  implements TtdFrontDao{

	//hv to create hashmap to create data instd of callng h2 db
	
	

	
	@Override
	public String getFormula(String convertedUnit) {
		System.out.println("inside daoimplstatic java file");
		
		return "*100";
	}

}
