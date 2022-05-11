package com.neonq.web.JSPExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.neonq.web")
public class JspExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JspExampleApplication.class, args);
	}

}
