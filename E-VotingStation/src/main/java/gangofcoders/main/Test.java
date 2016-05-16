package gangofcoders.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {


		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/context/applicationContext.xml");
		TestDAO dao = (TestDAO) ctx.getBean("TestDAO");
		dao.something();
	}
}
