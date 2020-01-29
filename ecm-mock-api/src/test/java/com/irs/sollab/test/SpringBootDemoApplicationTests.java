package com.irs.sollab.test;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.irs.sollab.rest.model.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testAddEmployeeWithoutHeader_success() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:"+8080+"/employees/";
	    URI uri = new URI(baseUrl);	     
	    Employee employee = new Employee(null, "Adam", "Gilly", "test@email.com");
	    ResponseEntity<String> result = restTemplate.postForEntity(uri, employee, String.class);	     
	    //Verify request succeed
	    Assert.assertEquals(201, result.getStatusCodeValue());
	}

}
