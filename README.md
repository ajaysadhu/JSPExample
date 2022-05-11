### SpringBoot + JSP Starter Kit

#### This project shows step-by-step guide to start a JSP Project with SpringBoot.

* Follow the instructions to start from scratch.
* Navigate to https://start.spring.io and select latest stable Spring Boot version.
* Select Java Version as per your need and select jar.
* In dependencies, add Spring Web and Spring DevTools.

![InitalTemplate](./docs/SpringBootJSP.png)
* Additionally add 	the below dependency to pom to initialize jsp pages:
```xml
  <dependency>  
  <groupId>org.apache.tomcat.embed</groupId>  
  <artifactId>tomcat-embed-jasper</artifactId>  
  </dependency>
  ```
* resources/application.properties should have jsp source locations:

> server.servlet.contextPath=/  
spring.mvc.view.prefix=/WEB-INF/jsp/  
spring.mvc.view.suffix=.jsp  
server.servlet.encoding.charset=UTF-8  
server.servlet.encoding.enabled=true  
server.servlet.encoding.force=true  

* Create a basic Controller and jsp page as shown in the code.
* Then Test the App after successful build and Execution as below:

![ViewJSP](./docs/Successful_jsp.png)

