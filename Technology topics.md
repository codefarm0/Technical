# This is my list of go through topics which I quote whenever I found so yes they are very random
=============================================================================================== 


 MD sytax guide - https://confluence.atlassian.com/bitbucketserver/markdown-syntax-guide-776639995.html/
 
 
## What is Cross-Origin Resource Sharing (CORS)


	https://spring.io/guides/gs/rest-service-cors/
	https://en.wikipedia.org/wiki/Cross-origin_resource_sharing/
	https://www.baeldung.com/spring-cors/
	
## JWT


	https://github.com/only2dhir/spring-boot-jwt/
	https://medium.com/@hantsy/protect-rest-apis-with-spring-security-and-jwt-5fbc90305cc5/
	https://www.youtube.com/watch?v=mD3vmgksvz8/
	
## Security with spring	


	https://dzone.com/articles/thoughts-and-ideas-related-to-java-programming/
	https://www.youtube.com/watch?v=cKjgkNt-tFg/
	JWS - json web signature
	
## Springboot-dev-tool is great

	Use it for hot swapping of code
	

## distributed tracing 
	### Zipkin - tracing services
		https://github.com/openzipkin/zipkin#quick-start/
		https://github.com/openzipkin/zipkin/tree/master/zipkin-server/
		https://github.com/openzipkin/sleuth-webmvc-example/ -- this good source
		opentracing.io
		
	### sleuth
	https://www.baeldung.com/spring-cloud-sleuth-single-application/
	
	> https://github.com/apache/incubator-zipkin-brave -- for instrumenataion
	> https://ai.google/research/pubs/pub36356 --Dapper, a Large-Scale Distributed Systems Tracing Infrastructure
	### dependencies - 
		> spring-cloud-sleuth
		> spring-cloud-sleuth-core
		> spring-cloud-sleuth-dependencies
		> spring-cloud-sleuth-zipkin
		> spring-cloud-sleuth
			>spring-cloud-starter
			>spring-boot-starter-aop
			>spring-cloud-sleuth-core
		> spring-cloud-zipkin
	

## ZUUL
	Zuul is an edge service that provides dynamic routing, monitoring, resiliency, security, and more.
	https://github.com/Netflix/zuul/
	
	
## protocols microservices use for communication
	https
	amqp
	apache thrift
	grpc
	custom tcp protocol

## Spring boot lazy intialization - in boot 2.2
	https://www.youtube.com/watch?v=_m4xpHUf55E/
	https://spring.io/blog/2019/03/14/lazy-initialization-in-spring-boot-2-2/
	
## Reactive programing with spring
	https://www.youtube.com/watch?v=l7VBdWhtl7A/
	

## Java NIO


## Prometheus and graffana
	https://dzone.com/articles/monitoring-using-spring-boot-2-prometheus-and-graf/
	
	
## @Preauthorize
	https://www.baeldung.com/spring-security-method-security/
	
		
## Netflix Ribbon
	For Load balancing

## Netflix eureka
	use to register/deregiste microservices
	
## Microservice communication -- Feign and RestTemplate
	https://www.baeldung.com/spring-cloud-netflix-hystrix
	https://dzone.com/users/3204300/arvind029.html?sort=saved/
	https://www.javainuse.com/spring/spring-cloud-netflix-feign-tutorial/
	https://spring.io/projects/spring-cloud
	https://github.com/OpenFeign/feign
	https://www.baeldung.com/intro-to-feign


## Microservices
	https://dzone.com/microservices-news-tutorials-tools
	
	
## Java 8,9,10,11,12
	
	
## Micronaut
	https://www.youtube.com/watch?v=YYvY9pc3Shw
	https://objectcomputing.com/resources/publications/sett/july-2018-micronaut-framework-for-the-future


## Serverless

## Ahead of time compilation vs Just in Time compilation(jit)
	Google project Dalvy
	
## JAXB
	https://www.youtube.com/watch?v=za4elW_AImo
	
## Grails IDE
	https://en.wikipedia.org/wiki/Grails_(framework)
	The target audience for Grails is:
		1. Java or Groovy developers who are looking for an integrated development environment to create web-based applications.
		2. Developers without Java experience looking for a high-productivity environment to build web-based applications.
	
## Mutation testing
	> https://link.springer.com/article/10.1007/s10664-017-9582-5
	Four mutation testing tools for Java, namely 
	PIT, 
	muJava, 
	Major and the research version of PIT, 
	PITRV
	stryker-mutator
	We investigate the strengths of the tools based on: a) a set of real faults and b) manual analysis of the mutants they introduce.
	> https://medium.com/appsflyer/tests-coverage-is-dead-long-live-mutation-testing-7fd61020330e
	Stop killing red line, kill the mutants
	> https://www.appsflyer.com/jobs/
	> http://pitest.org/java_mutation_testing_systems/
	# Mutation testing can be conceptually split into four phases
		Mutant generation - in which the classes are analysed and mutants created
		Test selection - in which tests are selected to run against the mutants
		Mutant insertion - in which mutants are loaded into a JVM
		Mutant detection - in which the selected tests are run against the loaded mutant
	> https://www.baeldung.com/java-mutation-testing-with-pitest
	> https://www.mkyong.com/maven/maven-pitest-mutation-testing-example/
	> http://pitest.org/quickstart/mutators/
## Redis
## RabbitMQ
## MySQL
## Spring Cloud Services.
## Java Annotations - java 1.5
	> WHat are built-in annoatations - metadata about the programe
	> custom annotations
	>parse annotations using reflection api
## Java Reflection Api
	> https://www.journaldev.com/1789/java-reflection-example-tutorial