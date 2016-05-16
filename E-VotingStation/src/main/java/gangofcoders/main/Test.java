package gangofcoders.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gangofcoders.dao.AddressDao;
import gangofcoders.domain.Address;

public class Test {
	
	public static void main(String[] args) {


		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/context/applicationContext.xml");
		
		TestService addressService =(TestService) ctx.getBean("testServiceImpl");
		Address address = new Address();
		address.setCity("asd");
		address.setState("da");
		address.setStreet("sda");
		address.setZip("sssss");
		
		addressService.save(address);
	
	}
}
