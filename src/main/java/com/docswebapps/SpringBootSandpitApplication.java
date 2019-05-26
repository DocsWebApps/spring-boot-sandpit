package com.docswebapps;

import com.docswebapps.jdbc.service.PersonService;
import com.docswebapps.spring5guru.controller.web.MyController;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.docswebapps.jdbc.service.JournalService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringBootSandpitApplication  implements CommandLineRunner {
	// To run this in an application server
	// 1. Extend SpringBootServletInitializer
	//		import org.springframework.boot.builder.SpringApplicationBuilder;
	//		import org.springframework.boot.web.support.SpringBootServletInitializer;
	//  	public class SpringBootSandpitApplication extends SpringBootServletInitializer implements CommandLineRunner {
	// 2. Override configure() method
	//  	@Override
	//    	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	//       	 return application.sources(SpringBootHelloworldApplication.class);
	//  	 }
	// 3. Alter the POM file 
	//		a). Change from JAR to WAR
	// 		b). Exclude Tomcat from spring-boot-starter-web
	//		c). Add servlet-api dependency
	//4. Run Maven update
	//5. Deploy
	// END
	
	private static final Logger log=LoggerFactory.getLogger(SpringBootSandpitApplication.class);
	private final JournalService journalService;
	private final PersonService personService;

	public SpringBootSandpitApplication(JournalService journalService,
										PersonService personService)
	{
		this.journalService = journalService;
		this.personService = personService;
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootSandpitApplication.class, args);
		// Retrieve a bean from the application context where all instantiated beans are held.
		MyController myController = (MyController) ctx.getBean("myController");
		myController.hello();
	}

	@Override
	public void run(String... arg0) throws Exception {
		// JDBC Package Code examples
		log.info("@@ Inserting Journal Data...");
		journalService.insertData();
		log.info("@@ findAll(); call...");
		journalService.findAll().forEach(entry -> log.info(entry.toString()));
		log.info("@@ Inserting Person Data ...");
		personService.insertData();
		log.info("@@ Get All Records...");
		personService.getAll().forEach(entry -> log.info(entry.toString()));
		// JDBC END
	}
}
